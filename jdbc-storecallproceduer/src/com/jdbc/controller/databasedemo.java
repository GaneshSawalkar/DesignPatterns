package com.jdbc.controller;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

import com.jdbc.reporsitory.connection;
import com.jdbc.service.Utility;
import com.jdbc.service.dbenum;

public class databasedemo {
	static Savepoint save = null;

	public static void main(String[] args) {

		try {

			CallableStatement cal = null;

			int ch;
			do {
				System.out.println("*****welcome to database*****");
				System.out.println(
						"1.insert students new \n2.Delete user by ID\n3.search students by id\n4.Show all students info\n5.Exit");
				System.out.println("please enter your choice: ");
				ch = Utility.integerInput();
				Connection con = connection.getJdbcConnection();
				switch (ch) {

				case 1:

					cal = con.prepareCall("{call addstudent(?,?,?)}"); // inserting
																		// data
					System.out.println("Enter Id : ");
					cal.setInt(1, Utility.integerInput()); // set id input
					System.out.println("Enter name : ");
					cal.setString(2, Utility.stringInput());// set name input
					System.out.println("Enter age : ");
					cal.setInt(3, Utility.integerInput());// set age input
					int row = cal.executeUpdate(); // updating table in database
					System.out.println("Data inserted on " + row);
					break;
				case 2:
					System.out.println("Enter id : ");
					int deleteById = Utility.integerInput();
					cal = con.prepareCall("{call deletebyid(?)}"); // delete
																	// student
					cal.setInt(1, deleteById); // check id
					cal.executeUpdate(); // updating data in database
					System.out.println("deleted id" + deleteById);
					break;
				case 3:
					System.out.println("Enter id to display student info: ");
					int id1 = Utility.integerInput();
					cal = con.prepareCall("{call searchbyid(?)}"); // call store procedure
					cal.setInt(1, id1); // set ? <- id1
					ResultSet rs = cal.executeQuery(); // execute query and get all data set in set
					while (rs.next()) {
						System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
					}
					break;
				case 4:
					cal = con.prepareCall("{call studadd}"); // record get all data in table
					ResultSet detailRs = cal.executeQuery();
					while (detailRs.next()) {
						System.out.println(detailRs.getInt(1) + " " + detailRs.getString(2) + " " + detailRs.getInt(3));
					}
					break;
				case 5:
					String str = dbenum.createprocedure();
					cal.executeUpdate(str);
					break;
				case 6:
					System.out.println("Bye....");
					break;
				default:
					System.out.println("invalid choice!!");
					break;
				}
			} while (ch != 6);
		} catch (SQLException e) {
			System.out.println(dbenum.iserror);
		}
	}

}