/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoolfx.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shekkar Raee
 */
public class MySQLConnection {
        public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/scoolfx","root","root");
		} catch (ClassNotFoundException | SQLException ex) {
			Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
		}
		return con;
	}
}
