package com.jdbc.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;

import com.jdbc.reporsitory.connection;
import com.jdbc.service.Utility;
import com.jdbc.service.dbenum;

public class databasedemo {
	static Savepoint save = null;

	public static void main(String[] args) {

		try {
			Connection con = connection.getJdbcConnection();
			PreparedStatement st = null; // creating prepared statement with null
			con.setAutoCommit(false);
			int ch;
			do {
				System.out.println("*****welcome to database*****");
				System.out.println(
						"1.insert students new info\n2.Delete user by ID\n3.search students by id\n4.Show all students info\n5.sbackup(savepoints)\n6.Rollback\n7.Exit(commit)");
				System.out.println("please enter your choice: ");
				ch = Utility.integerInput();
				switch (ch) {
				case 1:

					st = con.prepareStatement(dbenum.getqueryOpration(dbenum.querytype.insert)); // inserting
																									// data
					System.out.println("Enter Id : ");
					st.setInt(1, Utility.integerInput()); // set id input
					System.out.println("Enter name : ");
					st.setString(2, Utility.stringInput());// set name input
					System.out.println("Enter age : ");
					st.setInt(3, Utility.integerInput());// set age input
					int row = st.executeUpdate(); // updating table in database
					System.out.println("Data inserted on " + row);
					break;
				case 2:
					System.out.println("Enter id : ");
					int deleteById = Utility.integerInput();
					st = con.prepareStatement(dbenum.getqueryOpration(dbenum.querytype.deleteby)); // delete
																									// student
					st.setInt(1, deleteById); // check id
					st.executeUpdate(); // updating data in database
					System.out.println("deleted id" + deleteById);
					break;
				case 3:
					System.out.println("Enter id to display student info: ");
					int id1 = Utility.integerInput();
					st = con.prepareStatement(dbenum.getqueryOpration(dbenum.querytype.search)); // call store procedure
					st.setInt(1, id1); // set ? <- id1
					ResultSet rs = st.executeQuery(); // execute query and get all data set in set
					while (rs.next()) {
						System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
					}
					break;
				case 4:
					st = con.prepareStatement(dbenum.getqueryOpration(dbenum.querytype.select)); // record get all data
																									// in table
					ResultSet detailRs = st.executeQuery();
					while (detailRs.next()) {
						System.out.println(detailRs.getInt(1) + " " + detailRs.getString(2) + " " + detailRs.getInt(3));
					}
					break;
				case 5:
					save = con.setSavepoint("svpt1");
					System.out.println(dbenum.gettransactionOpration(dbenum.trancsaction.savepoint));
					break;
				case 6:
					con.rollback(save);
					System.out.println(dbenum.gettransactionOpration(dbenum.trancsaction.rollback));
					break;
				case 7:
					con.commit();
					System.out.println("Bye....!");
					break;

				default:
					System.out.println("invalid choice!!");
					break;
				}
			} while (ch != 7);
		} catch (SQLException e) {
			System.out.println(dbenum.iserror);
		}
	}

}