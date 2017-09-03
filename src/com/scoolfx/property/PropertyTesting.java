/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.property;

/**
 *
 * @author Shekkar Raee
 */
public class PropertyTesting {

        private static StaticProperty property = new StaticProperty();
        public static void main(String args[]) {
                System.err.println(property.getProperty("scoolfx.root.file.drive.path"));
        }
}
