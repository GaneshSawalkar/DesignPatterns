package com.designpatterns.structural.facade;

import java.sql.Connection;

public class Test {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		String tableName = "Employee";

		// generating MySql HTML report and Oracle PDF report without using Facade
		Connection con = Mysql.conmysql();
		Mysql my = new Mysql();
		Mysql.mysqlreport(tableName, con);

		Connection con1 = Oracle.conoracle();
		Oracle oracle = new Oracle();
		com.designpatterns.structural.facade.Oracle.oraclereport(tableName, con1);
		System.out.println("**********************************************");
		// generating MySql HTML report and Oracle PDF report using Facade
		Facade.generateReport(Facade.DBTypes.MYSQL, Facade.ReportTypes.HTML, tableName);
		Facade.generateReport(Facade.DBTypes.ORACLE, Facade.ReportTypes.PDF, tableName);
	}
}
