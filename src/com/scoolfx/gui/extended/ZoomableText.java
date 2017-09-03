/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.gui.extended;

import java.util.ArrayList;
import java.util.List;
import javafx.animation.ScaleTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.util.Duration;

/**
 *
 * @author Shekkar Raee
 */
public class ZoomableText extends HBox {
        public ZoomableText(String value, String family, Color color, double size) {
                super.setAlignment(Pos.CENTER_RIGHT);
                super.minHeight(25);
                Label texts[] = new Label[value.length()];                
                List<String> charLists = new ArrayList<>();
                value.chars().forEach(character -> charLists.add(String.valueOf(character)));
                for (int index = 0; index < texts.length; index++) {
                        texts[index] = new Label();
                        texts[index].setText(charLists.get(index));
                        texts[index].setTextFill(color);
                        texts[index].setFont(Font.font(family, FontWeight.LIGHT, FontPosture.REGULAR, size));
                        final Label text = texts[index];
                        text.setPadding(new Insets(3, 0, 3, 0));
                        texts[index].setOnMouseEntered(e -> applyOnAnimation(text));
                        texts[index].setOnMouseExited(e -> applyOffAnimation(text));
                        super.getChildren().add(texts[index]);
                }
        }

        private void applyOnAnimation(Label text) {
                ScaleTransition st = new ScaleTransition();
                st.setNode(text);
                st.setToX(2.2);
                st.setToY(2.2);
                st.setDuration(Duration.millis(50));
                st.play();
        }

        private void applyOffAnimation(Label text) {
                ScaleTransition st = new ScaleTransition();
                st.setNode(text);
                st.setToX(1);
                st.setToY(1);
                st.setDuration(Duration.millis(50));
                st.play();
        }
}
