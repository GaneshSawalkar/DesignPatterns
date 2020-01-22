package com.designpatterns.structural.facade;

import java.sql.Connection;

public class mysql {
	public static Connection conmysql() {
		return null;
	}

	public static void mysqlreport(String tableName, Connection con) {
		System.out.println("mysql html report generated");

	}

	public void mysqlreportpdf(String tableName, Connection con) {
		System.out.println("mysql pdf report generated");

	}
}
