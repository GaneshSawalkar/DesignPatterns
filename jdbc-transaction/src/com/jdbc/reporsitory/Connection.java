package com.jdbc.reporsitory;

import java.sql.Connection;
import java.sql.DriverManager;

import com.jdbc.service.Dbenum;

public class Connection {
	public static void main(String[] args) {
		getJdbcConnection();
	}

	public static Connection getJdbcConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // load database class drivers
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", ""); // generate
			// connection
			System.out.println("connected"); // show if message connect
			return con;
		} catch (Exception e) {
			System.out.println(Dbenum.iserror);
		}
		return null;

	}
}
