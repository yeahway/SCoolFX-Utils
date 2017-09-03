/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.db.builder;

import com.scoolfx.db.model.Student;

/**
 *
 * @author Shekkar Raee
 */
public class StudentBuilder {
        private final Student student = new Student();
        
        public StudentBuilder setStudentName(String name) {
                this.student.setStudentName(name);
                return this;
        }
        
        public Student build() {
                return student;
        }
}
