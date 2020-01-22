package com.jdbc.reporsitory;

import java.sql.Connection;
import java.sql.DriverManager;

import com.jdbc.service.dbenum;

public class connection {
	
	public static Connection getJdbcConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // load database class drivers
			Connection con = DriverManager.getConnection(dbenum.getPath(), dbenum.getUser(), dbenum.getPass()); // generate
			// connection
			System.out.println("connected"); // show if message connect
			return con;
		} catch (Exception e) {
			System.out.println(dbenum.iserror);
		}
		return null;

	}
}
