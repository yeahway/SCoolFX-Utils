/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.gui.utils;

import com.scoolfx.api.utils.DateTime;
import com.scoolfx.api.utils.FileCreator;
import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Bounds;
import javafx.scene.Node;
import javafx.stage.Stage;
import javax.imageio.ImageIO;

/**
 *
 * @author Shekkar Raee
 */
public final class ScreenShotPrinter {
	
	private Node node, owner;
	private String path, infos[];
	private FileCreator fc;
	
	public ScreenShotPrinter(Node owner, Node node, String infos[]) {
		this.owner = owner;
		this.node = node;
		this.infos = infos;
		this.infos[0] = this.combineWithDate(infos[0]);
		this.createImage();
	}
	
	/**
	 * Combines or adds the current date to the provided path.
	 * @param path
	 * @return combined-path
	 */
	public String combineWithDate(String path) {
		DateTime dt = new DateTime();
		return path+"/"+dt.getCurrentYear() +" " + dt.getCurrentMonth() + " " + dt.getDay() + "/";
	}
	/**
	 * Creates image.
	 */
	private void createImage() {		
		try {
			Robot theRobot = new Robot();
			Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle rectangle=new Rectangle(d);			
			Bounds theBound = getNode().localToScreen(getNode().getBoundsInLocal());
            
			int x = (int) theBound.getMinX() ;
			int y =(int) theBound.getMinY() ;
			int width = (int) theBound.getWidth() ;
			int height =(int) theBound.getHeight() ;			
			rectangle.setBounds(x, y, width, height);
            
			BufferedImage theImage = theRobot.createScreenCapture(rectangle);	
			            setFc(new FileCreator(getInfos()));
			            getFc().create();
			            setPath(getInfos()[0] + getInfos()[1] + (new Random().nextDouble() *1000) + ".png");
			ImageIO.write(theImage, "png", new File(getPath()));		
		} catch (AWTException | IOException ex) {
			Logger.getLogger(ScreenShotPrinter.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	/**
	 * Print the image.
	 */
	public void print() {
		Stage stage = (Stage) getOwner().getScene().getWindow();
		stage.toBack();
		stage.setIconified(true);
		try {
			Desktop.getDesktop().print(new File(getPath()));
		} catch (IOException ex) {
			Logger.getLogger(ScreenShotPrinter.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}
	
	/**
	 * Opens the image.
	 */
	public void open() {
		try {		
			Desktop.getDesktop().open(new File(getPath()));
		} catch (IOException ex) {
			Logger.getLogger(ScreenShotPrinter.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

        /**
         * @return the node
         */
        public Node getNode() {
                return node;
        }

        /**
         * @param node the node to set
         */
        public void setNode(Node node) {
                this.node = node;
        }

        /**
         * @return the owner
         */
        public Node getOwner() {
                return owner;
        }

        /**
         * @param owner the owner to set
         */
        public void setOwner(Node owner) {
                this.owner = owner;
        }

        /**
         * @return the path
         */
        public String getPath() {
                return path;
        }

        /**
         * @param path the path to set
         */
        public void setPath(String path) {
                this.path = path;
        }

        /**
         * @return the infos
         */
        public String[] getInfos() {
                return infos;
        }

        /**
         * @param infos the infos to set
         */
        public void setInfos(String[] infos) {
                this.infos = infos;
        }

        /**
         * @return the fc
         */
        public FileCreator getFc() {
                return fc;
        }

        /**
         * @param fc the fc to set
         */
        public void setFc(FileCreator fc) {
                this.fc = fc;
        }
}
