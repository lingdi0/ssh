package com.guigu.action;

import com.guigu.domain.User;
import com.guigu.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{
	private User user=new User();
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String login(){
		if(userService.login(user)){
			return SUCCESS;
		}else{
			return ERROR;
		}
	}

}
