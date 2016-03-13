package com.dao;

public class DAOFactory2 {
	public static Object getInstance(String type){
		Object obj = null;
		if(type.equals("userinfo")){
			obj = new userinfoDAOImp();
		}
		return obj;
	}
}
