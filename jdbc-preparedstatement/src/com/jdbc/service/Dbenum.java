package com.jdbc.service;

public class Dbenum {

	private static final String path = "jdbc:mysql://localhost:3306/students"; // path of database(students)
	private static final String user = "root"; // database user-name
	private static final String pass = ""; // database password
	public static final String isconnected = "connected Successfully...."; // connection confirmed message
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
		case drop:
			return "delete table " + tableName;
		case insert:
			return "insert into " + tableName + " values(?,?,?)";
		case update:

			System.out.println("enter id for update");
			int id = Utility.integerInput();
			System.out.println("enter new name");
			String updatename = Utility.stringInput();
			System.out.println("enter age: ");
			int newage = Utility.integerInput();

			return "update stud set first='" + updatename + "',age=" + newage + " where id=" + id;
		case search:
			return "select * from stud where id = ?";
		case deleteby:
			return "delete from stud where id = ?";
		default:
			return "wrong query";
		}

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
		create, select, delete, update, insert, search, deleteby, drop;
	}

	public enum database {
		create, drop;
	}

	public enum trancsaction {
		savepoint, commit, rollback;
	}

	public static String getPath() {
		return path;
	}

	public static String getUser() {
		return user;
	}

	public static String getPass() {
		return pass;
	}

}
