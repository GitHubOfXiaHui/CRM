package com.airwxtx.settings.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.airwxtx.settings.service.SettingsService;
import com.airwxtx.user.dao.UserDao;
import com.airwxtx.user.entity.User;

@Service
public class SettingsServiceImpl implements SettingsService {

	@Autowired
	private UserDao userDao;

	@Override
	@Transactional(readOnly = true)
	public User findUser(String username) {
		// TODO Auto-generated method stub
		List<User> usr = userDao.findByUsername(username);
		return usr.size() > 0 ? usr.get(0) : null;
	}

	@Override
	@Transactional
	public void changePassword(String username, String newPassword) {
		// TODO Auto-generated method stub
		List<User> usr = userDao.findByUsername(username);
		if (usr.size() > 0) {
			usr.get(0).setPassword(newPassword);
		}
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
