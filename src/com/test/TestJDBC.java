package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class TestJDBC {

	public static void main(String[] args) throws ClassNotFoundException, Exception {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@192.168.91.80:1521/nanjing";
		String username="hr";
		String password="hr";
		System.out.println("加载驱动前");
		
		Class.forName(driver);
		Connection conn=DriverManager.getConnection(url,username,password);
		//String sql="insert into test(id,username,password,department_id,priv,email) values(?,?,?,?,?,?)";
		String sql="select * from test";
		
		PreparedStatement ps=conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=ps.executeQuery();
		
		//rs.absolute(5);
		while(rs.next()){
			String email=rs.getString("email");
			System.out.println(email);
		}
		
		//rs.updateRow();
		
		//conn.commit();
		/*
		ps.setInt(1, 1);
		ps.setString(2, "sheng");
		ps.setString(3, "123456");
		ps.setString(4, "student");
		ps.setString(5, "5");
		ps.setString(6, "sheng@163.com");
		ps.executeUpdate();
		*/
		rs.close();
		ps.close();
		conn.close();
		
		
		System.out.println("加载驱动后");
	}

}
