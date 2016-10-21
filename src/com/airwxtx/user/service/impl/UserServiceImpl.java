package com.airwxtx.user.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.airwxtx.user.dao.UserDao;
import com.airwxtx.user.entity.User;
import com.airwxtx.user.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	private UserDao userDao;
	@Override
	public void saveUser(User user, List<Long> authorities) {
		// TODO Auto-generated method stub
		Long authority = 0l;
		for(Long item : authorities)
		{
			authority = authority | item;
		}
		user.setAuthority(authority);
		this.userDao.saveUser(user);
	}

	@Override
	public void updateUser(User user, List<Long> authorities) {
		// TODO Auto-generated method stub
		Long authority = 0l;
		for(Long item : authorities)
		{
			authority = authority | item;
		}
		user.setAuthority(authority);
		this.userDao.updateUser(user);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
