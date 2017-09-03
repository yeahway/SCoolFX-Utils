/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.db.model;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Shekkar Raee
 */
public class Class {
        private SimpleStringProperty name;
        private SimpleStringProperty classId;
        private SimpleStringProperty since;
        
        public Class() {
                this.name = null;
                this.classId = null;
                this.since = null;
        }
        
        public Class(String name, String classId, String since) {
                this.name = new SimpleStringProperty(name);
                this.classId = new SimpleStringProperty(classId);
                this.since = new SimpleStringProperty(since);
        }
        
        public void setName(String name) {
                this.name = new SimpleStringProperty(name);
        }
        
        public void setClassId(String classId) {
                this.classId = new SimpleStringProperty(classId);
        }
        
        public void setSince(String since) {
                this.since = new SimpleStringProperty(since);
        }
        
        public String getName() {
                return this.name.get();
        }
        
        public String getClassId() {
                return this.classId.get();
        }
        
        public String getSince() {
                return this.since.get();
        }
}
