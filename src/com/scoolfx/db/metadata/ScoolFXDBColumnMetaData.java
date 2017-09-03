/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.db.metadata;

import com.scoolfx.db.connection.MySQLConnection;
import com.scoolfx.db.enums.ExceptionEnum;
import com.scoolfx.db.exception.ColumnException;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author Shekkar Raee
 */
public class ScoolFXDBColumnMetaData {

        private ScoolFXDBTableMetaData tableMetaData;

        public ScoolFXDBColumnMetaData() {
                tableMetaData = new ScoolFXDBTableMetaData();
        }

        public List<String> getAllColumns(String tableName) throws ColumnException {
                try {
                        List<String> columns = new ArrayList<>();
                        Statement statement = MySQLConnection.getConnection().createStatement();
                        statement.setMaxRows(1);
                        ResultSetMetaData metaData = statement.executeQuery("SELECT * FROM scoolfx." + tableName).getMetaData();
                        for (int column_index = 0; column_index < metaData.getColumnCount(); column_index++) {
                                columns.add(metaData.getColumnName(column_index));
                        }
                        return columns;
                } catch (SQLException ex) {
                        Logger.getLogger(ScoolFXDBColumnMetaData.class.getName()).log(Level.SEVERE, null, ex);
                        throw new ColumnException(ExceptionEnum.COLUMN_RETRIEVE_ERROR.toString(), ex);
                }
        }

        /**
         *
         * @param tableName
         * @param columnName
         * @return check
         * @throws ColumnException
         * @since scoolfxdb 1.0.0
         */
        public boolean isColumnExists(String tableName, String columnName) throws ColumnException {
                return getAllColumns(tableName).contains(columnName);
        }

        public Map<String, List<String>> getAllTableColumnMap() {
                return tableMetaData.getAllTables().stream().collect(
                    Collectors.toMap(table_name -> table_name, table_name -> getAllColumns(table_name))
                );
        }
}
