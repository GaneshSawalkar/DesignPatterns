package main;

import java.sql.Connection;

import model.mysql;
import model.oracle;

public class test {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		String tableName = "Employee";

		// generating MySql HTML report and Oracle PDF report without using Facade
		Connection con = mysql.conmysql();
		mysql my = new mysql();
		my.mysqlreport(tableName, con);

		Connection con1 = oracle.conoracle();
		oracle oracle = new oracle();
		oracle.oraclereport(tableName, con1);
		System.out.println("**********************************************");
		// generating MySql HTML report and Oracle PDF report using Facade
		facade.generateReport(facade.DBTypes.MYSQL, facade.ReportTypes.HTML, tableName);
		facade.generateReport(facade.DBTypes.ORACLE, facade.ReportTypes.PDF, tableName);
	}
}
