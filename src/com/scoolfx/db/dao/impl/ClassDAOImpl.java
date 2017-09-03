/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.db.dao.impl;

import com.scoolfx.db.builder.ClassBuilder;
import com.scoolfx.db.connection.MySQLConnection;
import com.scoolfx.db.dao.ClassDAO;
import com.scoolfx.db.enums.ExceptionEnum;
import com.scoolfx.db.exception.ClassException;
import com.scoolfx.db.metadata.ScoolFXDBColumnMetaData;
import com.scoolfx.db.model.Class;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Shekkar Raee
 */
public class ClassDAOImpl implements ClassDAO{

        private ScoolFXDBColumnMetaData columnMetaData;
        
        public ClassDAOImpl() {
                columnMetaData = new ScoolFXDBColumnMetaData();
        }
        @Override
        public ObservableList<Class> getAllClasses() throws ClassException{
                try {
                        Statement statement = MySQLConnection.getConnection().createStatement();
                        ResultSet result = statement.executeQuery("SELECT * FROM scoolfx.CLASS");
                        ObservableList<Class> classes = FXCollections.observableArrayList();
                        while(result.next()) {
                                classes.add(new ClassBuilder().setClassId(result.getString("CLASS_ID")).setName(result.getString("NAME")).setSince(result.getString("SINCE")).build());
                        }
                        return classes;
                } catch (SQLException ex) {
                        Logger.getLogger(ClassDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                        throw new ClassException(ExceptionEnum.CLASS_RETRIEVE_ERROR.toString(), ex);
                }
        }
        
}
