package com.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class BaseDAO {
	private static Properties properties=new Properties();//ÊôÐÔÎÄ¼þ
	private static String driver;
	private static String url;
	private static String user;
	private static String password;
	
	static{	
			try {
				properties.load(BaseDAO.class.getClassLoader().getResourceAsStream("com/dao/db.properties"));
				driver=properties.getProperty("jdbc.driver");
				url=properties.getProperty("jdbc.url");
				user=properties.getProperty("jdbc.user");
				password=properties.getProperty("jdbc.password");
				Class.forName(driver);
			} catch (Exception e) {	
				e.printStackTrace();
				throw new RuntimeException(e);
			} 
		

	}
	
	public static Connection openConnection() throws SQLException{
		return DriverManager.getConnection(url,user,password);
	}
	
	public static void closeConnection(Connection con){
		if(con !=null){
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
