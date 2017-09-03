/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.db.dao;

import com.scoolfx.db.dao.impl.StudentDAOImpl;
import com.scoolfx.db.exception.StudentException;
import com.scoolfx.db.model.Student;
import java.util.List;
import java.util.Map;

/**
 * StudentDAO is an interface through which the {@link Student} class can be accessed. It is a data access object that provides the various methods to access the object.
 *
 * @author Shekkar Raee
 */
public interface StudentDAO {

        public Student getStudentById(String studentId) throws StudentException;

        /**
         * Searches the {@link Student} whose class and roll no are matched with the provided class and roll no.
         *
         * @param class_name the grade of the student
         * @param roll_no the roll no of the student
         * @see Student
         * @see StudentDAOImpl
         * @since scoolfxdb 1.0.0
         * @return Student Object
         */
        public Student getStudentByClassRollNo(String class_name, int roll_no) throws StudentException;

        /**
         * Searches the {@link Student} whose email address is equals to the provided email.
         *
         * @param email
         * @return Student Object
         * @see Student
         * @see StudentDAOImpl
         * @since scoolfxdb 1.0.0
         */
        public Student getStudentByEmail(String email) throws StudentException;

        /**
         * Searches the students whose class is the provided class_name.
         *
         * @param class_name the grade of the school
         * @see Student
         * @see StudentDAOImpl
         * @since scoolfxdb 1.0.0
         * @return List of students
         */
        public List<Student> getStudentsByClass(String class_name) throws StudentException;

        /**
         * Searches the students whose class and section are the provided class_name and section.
         *
         * @param class_name
         * @param section
         * @return List of students
         * @see Student
         * @see StudentDAOImpl
         * @since scoolfxdb 1.0.0
         */
        public List<Student> getStudentsByClassSection(String class_name, char section) throws StudentException;

        /**
         * Searches the students whose age lies in-between the provided from from_age to to_age.
         *
         * @param from_age from the age
         * @param to_age to the age
         * @return List of students
         * @see Student
         * @see StudentDAOImpl
         * @since scoolfxdb 1.0.0
         */
        public List<Student> getStudentByAgeGroup(int from_age, int to_age) throws StudentException;

        public List<Student> getAllStudents() throws StudentException;

        public Map<String, Student> getAllStudentsWithStudentId() throws StudentException;

        public Map<String, List<Student>> getAllStudentsWithClass() throws StudentException;

        public int countAllStudents() throws StudentException;

        public int countStudentsByClass(String class_name) throws StudentException;

        public int countStudentsByClassSection(String class_name, char section) throws StudentException;

        public int countStudentsByGender(String gender) throws StudentException;

        public int countStudentsByClassGender(String class_name, String gender) throws StudentException;

        public int countStudentsByClassSectionGender(String class_name, char section, String gender) throws StudentException;

        public int countStudentsByAgeGroup(int from_age, int to_age) throws StudentException;

        public int countStudentByClassAgeGroup(String class_name, int from_age, int to_age) throws StudentException;

        /**
         * 
         * @param class_name
         * @param section
         * @param from_age
         * @param to_age
         * @return 
         * @throws StudentException 
         */
        public int countStudentsByClassSectionAgeGroup(String class_name, char section, int from_age, int to_age) throws StudentException;

}
