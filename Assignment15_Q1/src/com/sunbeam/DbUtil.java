package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.net.ssl.ManagerFactoryParameters;

public class DbUtil {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL ="jdbc:mysql://localhost:3306/Javadb";
	public static final String DB_USER = "D3_80541_Hrutik";
	public static final String DB_PASSWORD ="80541";
	
	
	static {
		try {
			Class.forName(DB_DRIVER);
		}
		catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public static Connection getConnection() throws Exception{
		Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
		return con;
	}
}
