package com.airwxtx.user.action.impl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.airwxtx.user.action.UserAction;
import com.airwxtx.user.entity.Role;
import com.airwxtx.user.entity.User;
import com.airwxtx.user.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller("userAction")
@Scope("prototype")
public class UserActionImpl extends ActionSupport implements UserAction {
	
	private User user;
	
	private String username;
	
	private String role;
	
	private int page;
	
	//х╗оч
	private List<Long> authorities;
	
	private List<User> users;
	
	@Autowired
	private UserService userService;

	@Override
	public String preSave() throws Exception {
		// TODO Auto-generated method stub
		return INPUT;
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
	public String listUser() throws Exception {
		// TODO Auto-generated method stub
		users = userService.findUserWithPage(page, PAGE_SIZE);
		return LIST;
	}
	
	public int getMaxPage() {
		return userService.countMaxPage(PAGE_SIZE);
	}

	public List<String> getRoles() throws IllegalArgumentException, IllegalAccessException{
		List<String> roles = new ArrayList<String>();
		Field[] fields = Role.class.getFields();
		for(Field field : fields){
			roles.add((String) field.get(null));
		}
		return roles;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public List<Long> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<Long> authorities) {
		this.authorities = authorities;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	private static final int PAGE_SIZE = 10;
	
	private static final String LIST = "list";
	
}
