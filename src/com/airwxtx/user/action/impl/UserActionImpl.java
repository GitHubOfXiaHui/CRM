package com.airwxtx.user.action.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.airwxtx.user.action.UserAction;
import com.airwxtx.user.entity.User;
import com.airwxtx.user.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller("userAction")
@Scope("prototype")
public class UserActionImpl extends ActionSupport implements UserAction {
	private User user;
	//х╗оч
	private List<Long> authorities;
	@Autowired
	private UserService userService;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public List<Long> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<Long> authorities) {
		this.authorities = authorities;
	}

	@Override
	public String saveUser() throws Exception {
		// TODO Auto-generated method stub
		this.userService.saveUser(user, authorities);
		return null;
	}

	@Override
	public String updateUser() throws Exception {
		// TODO Auto-generated method stub
		this.userService.updateUser(user, authorities);
		return null;
	}

	@Override
	public String preSave() throws Exception {
		// TODO Auto-generated method stub
		return INPUT;
	}

	@Override
	public String listAllUsers() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
