package com.dao;

public class DAOFactory {
	
	private static userinfoDAOImp userinfo=new userinfoDAOImp();
	
	public static userinfoDAO getTestDAO(){
		return userinfo;
	}
}
