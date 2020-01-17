package database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class databasedemo {
	static Savepoint save = null;

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver"); // load database class drivers
			Connection con = DriverManager.getConnection(dbenum.path, dbenum.user, dbenum.pass); // generate connection
			System.out.println(dbenum.isconnected); // show if message connect
			Statement stmt = con.createStatement(); // creating statement
			CallableStatement cal = null;
			PreparedStatement st = null; // creating prepared statement with null
			stmt.execute("START TRANSACTION");
			con.setAutoCommit(false);
			int ch;
			do {
				System.out.println("*****welcome to database*****");
				System.out.println(
						"1.Database creation\n2.Database deletion\n3.Create table\n4.Delete table\n5.insert students new info\n6.Delete user by ID\n7.search students by id\n8.Show all students info\n9.sbackup(savepoints)\n10.Rollback\n11.Exit(commit)");
				System.out.println("please enter your choice: ");
				ch = Utility.integerInput();
				switch (ch) {
				case 1:
					stmt.execute(dbenum.getdatabaseOpration(dbenum.database.create)); // creating new database
					System.out.println("Database created");
					break;
				case 2:
					stmt.execute(dbenum.getdatabaseOpration(dbenum.database.drop)); // create new// table
					System.out.println(" database drop");
					break;
				case 3:
					stmt.execute(dbenum.getqueryOpration(dbenum.querytype.create)); // create new table
					System.out.println(" Table created");
					break;

				case 4:
					stmt.execute(dbenum.getqueryOpration(dbenum.querytype.delete)); // delete table
					System.out.println(" Table deleted");
					break;
				case 5:

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
				case 6:
					System.out.println("Enter id : ");
					int deleteById = Utility.integerInput();
					st = con.prepareStatement(dbenum.getqueryOpration(dbenum.querytype.deleteby)); // delete
																									// student
					st.setInt(1, deleteById); // check id
					st.executeUpdate(); // updating data in database
					System.out.println("deleted id" + deleteById);
					break;
				case 7:
					System.out.println("Enter id to display student info: ");
					int id1 = Utility.integerInput();
					cal = con.prepareCall("{call searchbyid(?)}"); // call store procedure
					cal.setInt(1, id1); // set ? <- id1
					ResultSet rs = cal.executeQuery(); // execute query and get all data set in set
					while (rs.next()) {
						System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
					}
					break;
				case 8:
					cal = con.prepareCall("{call studadd}"); // record get all data in table
					ResultSet detailRs = cal.executeQuery();
					while (detailRs.next()) {
						System.out.println(detailRs.getInt(1) + " " + detailRs.getString(2) + " " + detailRs.getInt(3));
					}
					break;
				case 9:
					save = con.setSavepoint("svpt1");
					System.out.println(dbenum.gettransactionOpration(dbenum.trancsaction.savepoint));
					break;
				case 10:
					con.rollback(save);
					System.out.println(dbenum.gettransactionOpration(dbenum.trancsaction.rollback));
					break;
				case 11:
					con.commit();
					System.out.println("Bye....!");
					break;

				default:
					System.out.println("invalid choice!!");
					break;
				}
			} while (ch != 11);
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(dbenum.iserror);
		}
	}

}