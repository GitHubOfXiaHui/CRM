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
	public List<User> findUserWithPage(int page, int pageSize) {
		// TODO Auto-generated method stub
		return userDao.findUserWithPage(page, pageSize);
	}
	
	@Override
	public int countMaxPage(int pageSize) {
		// TODO Auto-generated method stub
		return (userDao.countUser() - 1) / pageSize + 1;
	}


	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> listAllUsers() {
		// TODO Auto-generated method stub
		return this.userDao.listAllUsers();
	}

}
