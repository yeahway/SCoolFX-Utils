/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.db.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Shekkar Raee
 */
public class Student {
        private SimpleStringProperty studentDate;
        private SimpleStringProperty studentID;
        private SimpleStringProperty studentName;
        private SimpleStringProperty studentClass;
        private SimpleStringProperty studentSection;
        private SimpleIntegerProperty studentRollNo;
        private SimpleStringProperty studentDOB;
        private SimpleIntegerProperty studentAge;
        private SimpleStringProperty studentGender;
        private SimpleStringProperty studentAddress;
        private SimpleStringProperty studentPhoneNo;
        private SimpleStringProperty studentFatherName;
        private SimpleStringProperty fPhoneNo;
        private SimpleStringProperty studentMotherName;
        private SimpleStringProperty mPhoneNo;
        private SimpleStringProperty email;

        public Student() {
                this.studentDate = null;
                this.studentID = null;
                this.studentName = null;
                this.studentClass = null;
                this.studentSection = null;
                this.studentDOB = null;
                this.studentAge = null;
                this.studentRollNo = null;
                this.studentGender = null;
                this.studentAddress = null;
                this.studentPhoneNo = null;
                this.studentFatherName = null;
                this.fPhoneNo = null;
                this.studentMotherName = null;
                this.mPhoneNo = null;
                this.email = null;
        }

        public Student(String studentDate, String studentID, String studentName, String studentClass, String studentSection, int studentRollNo,
            String studentDOB, int studentAge, String studentGender, String studentAddress, String studentPhoneNo, String studentFatherName, String fPhoneNo,
            String studentMotherName, String mPhoneNo, String email) {
                this.studentDate = new SimpleStringProperty(studentDate);
                this.studentID = new SimpleStringProperty(studentID);
                this.studentName = new SimpleStringProperty(studentName);
                this.studentClass = new SimpleStringProperty(studentClass);
                this.studentSection = new SimpleStringProperty(studentSection);
                this.studentDOB = new SimpleStringProperty(studentDOB);
                this.studentAge = new SimpleIntegerProperty(studentAge);
                this.studentRollNo = new SimpleIntegerProperty(studentRollNo);
                this.studentGender = new SimpleStringProperty(studentGender);
                this.studentAddress = new SimpleStringProperty(studentAddress);
                this.studentPhoneNo = new SimpleStringProperty(studentPhoneNo);
                this.studentFatherName = new SimpleStringProperty(studentFatherName);
                this.fPhoneNo = new SimpleStringProperty(fPhoneNo);
                this.studentMotherName = new SimpleStringProperty(studentMotherName);
                this.mPhoneNo = new SimpleStringProperty(mPhoneNo);
                this.email = new SimpleStringProperty(email);
        }

        public void setStudentDate(String studentDate) {
                this.studentDate = new SimpleStringProperty(studentDate);
        }

        public void setStudentID(String studentID) {
                this.studentID = new SimpleStringProperty(studentID);
        }

        public void setStudentName(String studentName) {
                this.studentName = new SimpleStringProperty(studentName);
        }

        public void setStudentClass(String studentClass) {
                this.studentClass = new SimpleStringProperty(studentClass);
        }

        public void setStudentSection(String studentSection) {
                this.studentSection = new SimpleStringProperty(studentSection);
        }

        public void setStudentRollNo(int studentRollNo) {
                this.studentRollNo = new SimpleIntegerProperty(studentRollNo);
        }

        public void setStudentDOB(String studentDOB) {
                this.studentDOB = new SimpleStringProperty(studentDOB);
        }

        public void setStudentAge(int studentAge) {
                this.studentAge = new SimpleIntegerProperty(studentAge);
        }

        public void setStudentGender(String studentGender) {
                this.studentGender = new SimpleStringProperty(studentGender);
        }

        public void setStudentAddress(String studentAddress) {
                this.studentAddress = new SimpleStringProperty(studentAddress);
        }

        public void setStudentPhoneNo(String studentPhoneNo) {
                this.studentPhoneNo = new SimpleStringProperty(studentPhoneNo);
        }

        public void setStudentFatherName(String studentFatherName) {
                this.studentFatherName = new SimpleStringProperty(studentFatherName);
        }

        public void setFPhoneNo(String fPhoneNo) {
                this.fPhoneNo = new SimpleStringProperty(fPhoneNo);
        }

        public void setStudentMotherName(String studentMotherName) {
                this.studentMotherName = new SimpleStringProperty(studentMotherName);
        }

        public void setMPhoneNo(String mPhoneNo) {
                this.mPhoneNo = new SimpleStringProperty(mPhoneNo);
        }

        public void setEmail(String email) {
                this.email = new SimpleStringProperty(email);
        }

        public String getStudentDate() {
                return studentDate.get();
        }

        public String getStudentID() {
                return studentID.get();
        }

        public String getStudentName() {
                return studentName.get();
        }

        public String getStudentClass() {
                return studentClass.get();
        }

        public String getStudentSection() {
                return studentSection.get();
        }

        public String getStudentDOB() {
                return studentDOB.get();
        }

        public int getStudentAge() {
                return studentAge.get();
        }

        public int getStudentRollNo() {
                return studentRollNo.get();
        }

        public String getStudentGender() {
                return studentGender.get();
        }

        public String getStudentAddress() {
                return studentAddress.get();
        }

        public String getStudentPhoneNo() {
                return studentPhoneNo.get();
        }

        public String getStudentFatherName() {
                return studentFatherName.get();
        }

        public String getFPhoneNo() {
                return fPhoneNo.get();
        }

        public String getStudentMotherName() {
                return studentMotherName.get();
        }

        public String getMPhoneNo() {
                return mPhoneNo.get();
        }

        public String getEmail() {
                return email.get();
        }
}
