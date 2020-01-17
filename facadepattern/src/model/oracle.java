package model;

import java.sql.Connection;

public class oracle {
	public static Connection conoracle() {
		return null;
	}

	public static void oraclereport(String tableName, Connection con) {
		System.out.println("oracle html report generated");

	}

	public void oraclereportpdf(String tableName, Connection con) {
		System.out.println("oracle pdf report generated");
		
	}
}
