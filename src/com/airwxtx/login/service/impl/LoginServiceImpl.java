package com.airwxtx.login.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.airwxtx.login.service.LoginService;
import com.airwxtx.user.dao.UserDao;
import com.airwxtx.user.entity.User;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserDao userDao;

	@Override
	@Transactional(readOnly = true)
	public boolean canLogin(User user) {
		// TODO Auto-generated method stub
		List<User> usr = userDao.findUserByName(user.getUsername());
		return !usr.isEmpty() && usr.get(0).getPassword().equals(user.getPassword());
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
