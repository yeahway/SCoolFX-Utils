/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.db.builder;

/**
 *
 * @author Shekkar Raee
 */
public class ClassBuilder {
        private final com.scoolfx.db.model.Class classObject = new com.scoolfx.db.model.Class();
        
        public ClassBuilder setName(String name) {
                classObject.setName(name);
                return this;
        }
        
        public ClassBuilder setClassId(String classId) {
                classObject.setClassId(classId);
                return this;
        }
        
        public ClassBuilder setSince(String since) {
                classObject.setSince(since);
                return this;
        }
        
        public  com.scoolfx.db.model.Class build() {
                return classObject;
        }
        
}
