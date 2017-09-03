/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.gui.utils;

import javafx.scene.Node;
import javafx.stage.Screen;

/**
 *
 * @author Shekkar Raee
 */
public class SizeHelper {
	
	/**
	 * Returns the visual screen width.
	 * @return window-width
	 */
	public double getWindowWidth() {
		return Screen.getPrimary().getVisualBounds().getWidth();
	}
	
	/**
	 * Returns the visual screen height
	 * @return window-height
	 */
	public double getWindowHeight() {
		return Screen.getPrimary().getVisualBounds().getHeight();
	}
	
	/**
	 * 
	 * @param node
	 * @return max-x
	 */
	public double getMaxX(Node node) {
		return node.localToScreen(node.getBoundsInLocal()).getMaxX();
	}
	/**
	 * 
	 * @param node
	 * @return min-x
	 */
	public double getMinX(Node node) {
		return node.localToScreen(node.getBoundsInLocal()).getMinX();
	}
	/**
	 * 
	 * @param node
	 * @return max-y
	 */
	public double getMaxY(Node node) {
		return node.localToScreen(node.getBoundsInLocal()).getMaxY();
	}
	/**
	 * 
	 * @param node
	 * @return min-y
	 */
	public double getMinY(Node node) {
		return node.localToScreen(node.getBoundsInLocal()).getMinY();
	}
}
