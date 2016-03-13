package com.test;

import java.sql.Connection;

import org.apache.commons.dbcp2.BasicDataSource;

import com.dao.userinfoDAOImp;

public class testDAO {

	public static void main(String[] args) throws Exception {
		
		userinfoDAOImp td=new userinfoDAOImp();
		System.out.println(td.findById(1).get(0).toString());
		
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@192.168.91.80:1521/nanjing";
		String username="hr";
		String password="hr";
		
		BasicDataSource bds=new BasicDataSource();
		bds.setDriverClassName(driver);
		bds.setUrl(url);
		bds.setUsername(username);
		bds.setPassword(password);
		
		bds.setInitialSize(10);
		bds.setMaxTotal(20);
		bds.setMaxIdle(12);
		
		Connection con=bds.getConnection();
	
	}

}
