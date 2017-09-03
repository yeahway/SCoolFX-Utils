/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.gui.extended;

import com.scoolfx.gui.utils.SizeHelper;
import javafx.animation.ScaleTransition;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

/**
 *
 * @author Shekkar Raee
 */
public class PieMaster extends PieChart {

        private String data_types[];
        private int data_values[];

        /**
         * Pie-Master is a subclass of {@link javafx.scene.chart.PieChart} which can be dynamic according to the provided parameters.
         *
         * @param data_types the pie cell value names
         * @param data_values the associated cell values
         */
        public PieMaster(String[] data_types, int[] data_values) {
                this.data_types = data_types;
                this.data_values = data_values;
                this.setLegendSide(Side.RIGHT);
                this.setData(getDataList());
                this.autosize();
                this.setHover(true);
                this.setEffect(new DropShadow());

                int total = 0;

                for (int i = 0; i < getData().stream().count(); i++) {
                        total += getData().get(i).getPieValue();
                }

                for (int i = 0; i < getData().stream().count(); i++) {
                        Data data = getData().get(i);
                        Node node = data.getNode();
                        node.setCursor(Cursor.HAND);
                        Tooltip tip = new Tooltip();
                        tip.setText(data.getName()
                            + " \n "
                            + ((int) ((data.getPieValue() / total) * 100))
                            + "% ::  "
                            + ((int) ((data.getPieValue() / total) * 360))
                            + "ᵒ");

                        node.addEventHandler(MouseEvent.MOUSE_ENTERED, event -> this.nodeHovered(node, tip));
                        node.addEventHandler(MouseEvent.MOUSE_EXITED, event -> this.nodeHoveredOff(tip));
                }
                this.setStyle("-fx-background-color:white; -fx-border-radius:0 0 8 0; -fx-background-radius:0 0 8 0;");
        }

        private void nodeHoveredOff(Tooltip tip) {
                tip.hide();
                boolean hovered = false;
                for (int i = 0; i < getData().stream().count(); i++) {
                        if (getData().get(i).getNode().isHover()) {
                                hovered = true;
                                break;
                        }
                }
                if (!hovered) {
                        getData().stream().forEach(data -> {
                                data.getNode().setEffect(null);
                        });
                }
        }

        private void nodeHovered(Node node, Tooltip tip) {
                ScaleTransition st = new ScaleTransition();
                st.setNode(node);
                st.setToX(1);
                st.setToY(1);
                st.setDuration(Duration.millis(100));
                st.play();

                ScaleTransition st2 = new ScaleTransition();
                st2.setNode(node);
                st2.setFromX(1.05);
                st2.setToX(1);
                st2.setFromY(1.05);
                st2.setToY(1);
                st2.setDuration(Duration.millis(200));
                st2.play();
                st2.setOnFinished(e -> st.play());

                this.setBlur(node);

                SizeHelper helper = new SizeHelper();
                tip.show(node.getScene().getWindow(), helper.getMinX(node) + 50, helper.getMinY(node) + 50);
        }

        private void setBlur(Node node) {
                this.getData().stream().forEach(data -> {
                        if (data.getNode().equals(node)) {
                                node.setEffect(null);
                                node.setBlendMode(BlendMode.EXCLUSION);
                        } else {
                                GaussianBlur blur = new GaussianBlur();
                                blur.setRadius(7);
                                data.getNode().setEffect(blur);
                                node.setBlendMode(null);
                        }
                });
        }

        private ObservableList<PieChart.Data> getDataList() {
                PieChart.Data data[] = new Data[data_types.length];
                for (int i = 0; i < data.length; i++) {
                        data[i] = new PieChart.Data(data_types[i], data_values[i]);
                }
                return observableArrayList(data);
        }
}
