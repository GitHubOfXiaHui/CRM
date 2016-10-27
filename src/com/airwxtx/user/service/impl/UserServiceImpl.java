package com.airwxtx.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.airwxtx.user.dao.UserDao;
import com.airwxtx.user.entity.User;
import com.airwxtx.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public void saveUser(User user, List<Long> authorities) {
		// TODO Auto-generated method stub
		Long authority = 0l;
		for (Long item : authorities) {
			authority = authority | item;
		}
		user.setAuthority(authority);
		this.userDao.saveUser(user);
	}

	@Override
	public void updateUser(User user, List<Long> authorities) {
		// TODO Auto-generated method stub
		Long authority = 0l;
		for (Long item : authorities) {
			authority = authority | item;
		}
		user.setAuthority(authority);
		this.userDao.updateUser(user);
	}
	
	public void updateUser(User user){
		this.userDao.updateUser(user);
	}

	@Override
	@Transactional(readOnly = true)
	public User findUserByName(String username) {
		// TODO Auto-generated method stub
		List<User> usr = userDao.findByUsername(username);
		return usr.size() > 0 ? usr.get(0) : null;
	}
	
	@Override
	public List<User> findUserByNameOrRoleWithPage(String username, String role, int page, int pageSize) {
		// TODO Auto-generated method stub
		return userDao.findUserByNameOrRoleWithPage(username, role, page, pageSize);
	}
	
	@Override
	public int countUserWithNameOrRole(String username, String role) {
		// TODO Auto-generated method stub
		return userDao.countUserWithNameOrRole(username, role);
	}


	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
