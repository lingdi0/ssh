package com.guigu.service;

import com.guigu.dao.UserDao;
import com.guigu.domain.User;

public class UserService {
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public boolean login(User user){
		User u=userDao.findByName(user.getUsername());
		if(u!=null){
			if(u.getPassword().equals(user.getPassword())){
				return true;
			}
		}
		return false;
	}

}
