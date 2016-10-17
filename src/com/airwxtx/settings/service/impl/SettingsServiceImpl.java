package com.airwxtx.settings.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airwxtx.settings.service.SettingsService;
import com.airwxtx.user.dao.UserDao;
import com.airwxtx.user.entity.User;

@Service
public class SettingsServiceImpl implements SettingsService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public User findUser(String username) {
		// TODO Auto-generated method stub
		List<User> usr = userDao.findByUsername(username);
		return usr.size() > 0 ? usr.get(0) : null;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
