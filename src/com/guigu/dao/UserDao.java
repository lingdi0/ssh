package com.guigu.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.guigu.domain.User;

public class UserDao extends HibernateDaoSupport{
	public User findByName(String username){
		List list=this.getHibernateTemplate().find("from User where username=?", username);
		if(list.size()>0){
			return (User) list.get(0);
		}else{
			return null;
		}
	}

}
