package com.jdbc.service;

public class Dbenum {

	static final String path = "jdbc:mysql://localhost:3306/students"; // path of database(students)
	static final String user = "root"; // database user-name
	static final String pass = ""; // database password
	static final String isconnected = "connected Successfully...."; // connection confirmed message
	public static final String iserror = "connection error...!"; // connection error

	public static String getqueryOpration(querytype type) { // query selection
		System.out.println("Enter table name: ");
		String tableName = Utility.stringInput();
		switch (type) {
		case create:
			return "CREATE TABLE IF NOT EXISTS " + tableName
					+ "(id INTEGER not null, first VARCHAR(100), age INTEGER, PRIMARY KEY (id))";
		case select:
			return ("select * from " + tableName);
		case delete:
			return "delete table " + tableName;
		case insert:
			return "insert into " + tableName + " values(?,?,?)";
		case update:
			return "update table stud set values id=";
		case search:
			return "select * from stud where id = ?";
		case deleteby:
			return "delete from stud where id = ?";
		default:
			return "wrong query";
		}

	}

	public static String createprocedure() {
		String studentadd = "CREATE PROCEDURE `studadd1`() BEGIN select * from stud; END";
		return studentadd;
	}

	public static String getdatabaseOpration(database type) { // database operation
		System.out.println("enter dtabase name");
		String dbname = Utility.stringInput();
		switch (type) {
		case create:
			return "CREATE DATABASE IF NOT EXISTS " + dbname;
		case drop:

			return "DROP DATABASE " + dbname;
		default:
			return "wrong choice";
		}
	}

	public static String gettransactionOpration(trancsaction type) { // transaction operation
		switch (type) {
		case commit:
			return "commit successfully....";
		case rollback:
			return "rollback successfully....";
		case savepoint:
			return "backup successfully....";
		default:
			return "wrong choice";
		}
	}

	public enum querytype {
		create, select, delete, update, insert, search, deleteby;
	}

	public enum database {
		create, drop;
	}

	public enum trancsaction {
		savepoint, commit, rollback;
	}
}
