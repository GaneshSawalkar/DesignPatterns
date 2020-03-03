package com.designpatterns.structural.facade;

import java.sql.Connection;

public class Facade {
	public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
		Connection con = null;
		switch (dbType) {
		case MYSQL:
			con = Mysql.conmysql();
			Mysql mysql = new Mysql();
			switch (reportType) {
			case HTML:
				com.designpatterns.structural.facade.Mysql.mysqlreport(tableName, con);
				break;
			case PDF:
				mysql.mysqlreportpdf(tableName, con);
				break;
			}
			break;
		case ORACLE:
			con = Oracle.conoracle();
			Oracle oracle = new Oracle();
			switch (reportType) {
			case HTML:
				com.designpatterns.structural.facade.Oracle.oraclereport(tableName, con);
				break;
			case PDF:
				oracle.oraclereportpdf(tableName, con);
				break;
			}
			break;
		}

	}

	public static enum DBTypes {
		MYSQL, ORACLE;
	}

	public static enum ReportTypes {
		HTML, PDF;
	}
}
