/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.property;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shekkar Raee
 */
public class StaticProperty {
        private final Properties SCOOLFX_PROPERTY;
	private final String FILE_PATH;
	
	public StaticProperty() {
		SCOOLFX_PROPERTY = new Properties();
		FILE_PATH = "src/resources/scoolfxproperty.properties";
	}
	
	public String getProperty(String name) {
		String value = "";
		Reader reader = null;
		try {
			reader = new FileReader(FILE_PATH);
			SCOOLFX_PROPERTY.load(reader);
		} catch (FileNotFoundException ex) {
			Logger.getLogger(StaticProperty.class.getName()).log(Level.SEVERE, null, ex);
		
		} catch (IOException ex) {
			Logger.getLogger(StaticProperty.class.getName()).log(Level.SEVERE, null, ex);
		}
		try{
			value =  SCOOLFX_PROPERTY.getProperty(name);
		}catch(Exception e){}
		return value;
	}
}
