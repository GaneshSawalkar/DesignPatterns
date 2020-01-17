package main;

import java.sql.Connection;

import model.mysql;
import model.oracle;

public class facade {
	public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
		Connection con = null;
		switch (dbType) {
		case MYSQL:
			con = mysql.conmysql();
			mysql mysql = new mysql();
			switch (reportType) {
			case HTML:
				model.mysql.mysqlreport(tableName, con);
				break;
			case PDF:
				mysql.mysqlreportpdf(tableName, con);
				break;
			}
			break;
		case ORACLE:
			con = oracle.conoracle();
			oracle oracle = new oracle();
			switch (reportType) {
			case HTML:
				model.oracle.oraclereport(tableName, con);
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
