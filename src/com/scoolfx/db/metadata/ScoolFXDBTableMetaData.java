/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.db.metadata;

import com.scoolfx.db.connection.MySQLConnection;
import com.scoolfx.db.enums.ExceptionEnum;
import com.scoolfx.db.exception.TableException;
import com.scoolfx.property.StaticProperty;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author Shekkar Raee
 */
public class ScoolFXDBTableMetaData {

        private StaticProperty PROPERTY;

        public ScoolFXDBTableMetaData() {
                PROPERTY = new StaticProperty();
        }

        public boolean isTableExists(String tableName) throws TableException {
                return false;
        }

        public void createTable(String tableName, List<String> columns) {
                if (!isTableExists(tableName)) {
                        String query = "CREAT TABLE " + PROPERTY.getProperty("scoolfx.database.name") + "." + tableName + "("
                            + columns.stream().collect(Collectors.joining(",")) + ")";
                        Statement statement;
                        try {
                                statement = MySQLConnection.getConnection().createStatement();
                                statement.executeUpdate(query);
                        } catch (SQLException ex) {
                                Logger.getLogger(ScoolFXDBTableMetaData.class.getName()).log(Level.SEVERE, null, ex);
                                throw new TableException(ExceptionEnum.CLASS_CREATE_ERROR.toString(), ex);
                        }
                }
        }

        public List<String> getAllTables() {
                
                return new ArrayList<>();
        }
}
