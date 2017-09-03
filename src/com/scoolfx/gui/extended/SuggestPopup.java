/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.gui.extended;

import com.scoolfx.gui.utils.SizeHelper;
import javafx.animation.ScaleTransition;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.LabelBuilder;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBoxBuilder;
import javafx.scene.layout.VBox;
import javafx.scene.layout.VBoxBuilder;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Popup;
import javafx.util.Duration;

/**
 *
 * @author Shekkar Raee
 */
public final class SuggestPopup extends Popup {

        private Node node;
        private BorderPane content;

        /**
         * Suggest for error pop-up
         *
         * @param node
         * @param error
         * @param suggestions
         * @param example
         */
        public SuggestPopup(Node node, String error, String suggestions, String example) {
                this.node = node;
                super.setAutoHide(true);
                super.setHideOnEscape(true);
                content = contentOne(error, suggestions, example);
                super.getContent().add(content);
        }

        /**
         * Suggest for info pop-up
         *
         * @param node
         * @param state
         * @param info
         */
        public SuggestPopup(Node node, String state, String info) {
                this.node = node;
                super.setAutoHide(true);
                super.setHideOnEscape(true);
                content = contentTwo(state, info);
                super.getContent().add(content);
        }

        /**
         * Shows the pop-up
         */
        public void showPopup() {
                SizeHelper size = new SizeHelper();
                super.show(node, size.getMinX(node) + 10, size.getMinY(node) + 5);
                ScaleTransition st = new ScaleTransition();
                st.setNode(content);
                st.setFromX(0);
                st.setToX(1);
                st.setDuration(Duration.millis(500));
                st.play();
        }

        /**
         * Pop-up content for error-suggest
         *
         * @param error
         * @param suggestions
         * @param example
         * @return content
         */
        public BorderPane contentOne(String error, String suggestions, String example) {
                content = new BorderPane();
                content.setStyle(paneStyle());
                content.setCenter(
                    getErrorBox(error, suggestions, example)
                );
                content.setOnMouseExited(e -> this.hide());
                return content;
        }

        /**
         * Pop-up content for info-pop-up
         *
         * @param state
         * @param info
         * @return content
         */
        @SuppressWarnings("deprecation")
        public BorderPane contentTwo(String state, String info) {
                content = new BorderPane();
                content.setStyle(paneStyle());
                content.setCenter(getErrorFreeBox(state, info));
                content.setOnMouseExited(e -> this.hide());
                return content;
        }

        /**
         * Vertical-box which contains info
         *
         * @param state
         * @param info
         * @return error-free-box
         */
        @SuppressWarnings("deprecation")
        public VBox getErrorFreeBox(String state, String info) {
                return VBoxBuilder.create().children(
                    HBoxBuilder.create().padding(new Insets(10, 0, 0, 0)).children(
                        LabelBuilder.create().textFill(Color.GREENYELLOW).text("  " + state + "  ")
                            .font(Font.font("Segoe Print", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 14)).build()
                    ).style(styleOne()).build(),
                    HBoxBuilder.create().padding(new Insets(0, 0, 10, 0)).children(
                        LabelBuilder.create().textFill(Color.WHITE).text("  " + info + "  ")
                            .font(Font.font("Segoe Print", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 14)).build()
                    ).style(styleTwo()).build()
                ).build();
        }

        /**
         * Vertical box which contains error-suggestion
         *
         * @param error
         * @param suggestions
         * @param example
         * @return error-box
         */
        @SuppressWarnings("deprecation")
        public VBox getErrorBox(String error, String suggestions, String example) {
                return VBoxBuilder.create().children(
                    HBoxBuilder.create().padding(new Insets(10, 0, 0, 0)).children(
                        LabelBuilder.create().font(Font.font("Segoe Print", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 14))
                            .textFill(Color.RED).text("  " + error + "  ").build()
                    ).style(styleThree()).build(),
                    HBoxBuilder.create().padding(new Insets(10, 0, 0, 0)).children(
                        LabelBuilder.create().font(Font.font("Segoe Print", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 14))
                            .textFill(Color.WHITE).text("  " + suggestions + "  ").build()
                    ).style(styleTwo()).build(),
                    HBoxBuilder.create().padding(new Insets(10, 0, 0, 0)).children(
                        LabelBuilder.create().font(Font.font("Segoe Print", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 14))
                            .textFill(Color.GREENYELLOW).text("  " + example + "  ").build()
                    ).style(styleOne()).build()
                ).build();
        }

        private String paneStyle() {
                return "-fx-border-color: white; -fx-border-width: 1; -fx-border-radius:2; -fx-background-radius:2";
        }

        private String styleOne() {
                return "-fx-background-color:black";
        }

        private String styleTwo() {
                return "-fx-background-color:darkslategrey";
        }

        private String styleThree() {
                return "-fx-background-color:lightgrey";
        }
}
