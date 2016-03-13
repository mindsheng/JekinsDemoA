package com.dao;

import java.util.List;
import com.entity.userinfo;

public interface userinfoDAO {
	public List<userinfo> findById(int id) throws Exception;
}
