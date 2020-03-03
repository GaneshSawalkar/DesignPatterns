package com.designpatterns.structural.facade;

import java.sql.Connection;

public class Oracle {
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
