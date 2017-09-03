/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.db.dao.impl;

import com.scoolfx.db.connection.MySQLConnection;
import com.scoolfx.db.dao.StudentDAO;
import com.scoolfx.db.enums.ExceptionEnum;
import com.scoolfx.db.exception.StudentException;
import com.scoolfx.db.model.Student;
import com.scoolfx.db.builder.StudentBuilder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author Shekkar Raee
 */
public class StudentDAOImpl implements StudentDAO {

        private final ClassDAOImpl classDAO;
        
        public StudentDAOImpl() {
                classDAO = new ClassDAOImpl();
        }
          /**
         * Searches the {@link Student} whose studentId is matched with the provided studentId and returns the student object.
         *
         * @param studentId
         * @return Student Object
         * @see Student
         * @see StudentDAOImpl
         * @since scoolfxdb 1.0.0
         */
        @Override
        public Student getStudentById(String studentId) throws StudentException{
                try {
                        Statement statement = MySQLConnection.getConnection().createStatement();
                        ResultSet result = statement.executeQuery("SELECT * FROM scoolfx.STUDENTS");
                        return new StudentBuilder().build();
                } catch (SQLException ex) {
                        Logger.getLogger(StudentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                        throw new StudentException(ExceptionEnum.STUDENT_RETRIEVE_ERROR.toString(), ex);
                }
        }

        @Override
        public Student getStudentByClassRollNo(String class_name, int roll_no) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Student getStudentByEmail(String email) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public List<Student> getStudentsByClass(String class_name) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public List<Student> getStudentsByClassSection(String class_name, char section) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public List<Student> getStudentByAgeGroup(int from_age, int to_age) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Map<String, Student> getAllStudentsWithStudentId() {
                return getAllStudents().stream().collect(Collectors.toMap(Student::getStudentID, Function.identity()));
        }

        @Override
        public Map<String, List<Student>> getAllStudentsWithClass() {
                return classDAO.getAllClasses().stream().collect(Collectors.toMap(com.scoolfx.db.model.Class::getClassId, class_element -> getStudentsByClass(class_element.getName())));
        }

        @Override
        public int countAllStudents() {
                return getAllStudents().size();
        }

        @Override
        public int countStudentsByClass(String class_name) {
                return getStudentsByClass(class_name).size();
        }

        @Override
        public int countStudentsByClassSection(String class_name, char section) {
                return getStudentsByClassSection(class_name, section).size();
        }

        @Override
        public int countStudentsByGender(String gender) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int countStudentsByClassGender(String class_name, String gender) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int countStudentsByClassSectionGender(String class_name, char section, String gender) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int countStudentsByAgeGroup(int from_age, int to_age) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int countStudentByClassAgeGroup(String class_name, int from_age, int to_age) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int countStudentsByClassSectionAgeGroup(String class_name, char section, int from_age, int to_age) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public List<Student> getAllStudents() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

}
