package com.all.service;

import com.all.dao.BaseDao;
import com.all.dao.BaseDaoImpl;
import com.all.pojo.User;

public class BaseServiceImpl implements BaseService {
	private BaseDao loginDao = new BaseDaoImpl();

	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public String registration(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
