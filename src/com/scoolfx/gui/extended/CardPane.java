/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.gui.extended;

import java.util.ArrayList;
import java.util.Arrays;
import javafx.scene.Node;
import javafx.scene.layout.Pane;

/**
 *
 * @author Shekkar Raee
 */
public class CardPane extends Pane {	
	private ArrayList<Node> lists;
	
	/**
	 * Card-Pane with no initial node or nodes.
	 */
	public CardPane() {
		lists = new ArrayList<>();
	}
	
	/**
	 * Card-Pane with a card.
	 * @param node 
	 */
	public CardPane(Node node) {
		lists = new ArrayList<>();
		lists.add(node);
		getChildren().addAll(lists);
	}
	
	/**
	 * Card-Pane with the number of cards
	 * @param nodes 
	 */
	public CardPane(Node...nodes) {		
		lists = new ArrayList<>();
		lists.addAll(Arrays.asList(nodes));
		getChildren().addAll(lists);
	}	
}
