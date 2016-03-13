package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.entity.userinfo;

public class userinfoDAOImp extends BaseDAO implements userinfoDAO{
	
	public List<userinfo> findById(int id) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		con=openConnection();
		//con.setAutoCommit(false);
		
		String sql="select * from userinfo where id=?";
		ps=con.prepareStatement(sql);
		ps.setInt(1,id);
		//ps.addBatch();//批处理
		//ps.executeBatch();
		rs=ps.executeQuery();
		//con.commit();
		//con.rollback();
		return toList(rs);

	}
	
	
	private List<userinfo> toList(ResultSet rs) throws SQLException{
		List<userinfo> list = new ArrayList<userinfo>();
		
		while(rs.next()){
			userinfo userinf=new userinfo();//一条记录就是一个test实体
			userinf.setId(rs.getInt("id"));
			userinf.setUsername(rs.getString("username"));
			userinf.setPassword(rs.getString("password"));
			userinf.setPriv(rs.getString("priv"));
			userinf.setDepartment_id(rs.getString("department_id"));
			userinf.setEmail(rs.getString("email"));
			list.add(userinf);
		}
		return list;
	}
	
}
