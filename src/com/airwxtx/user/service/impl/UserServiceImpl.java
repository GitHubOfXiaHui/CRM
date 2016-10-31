package com.airwxtx.user.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.airwxtx.user.dao.UserDao;
import com.airwxtx.user.entity.User;
import com.airwxtx.user.service.UserService;
import com.airwxtx.utils.Constants;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public boolean hasUsername(String username) {
		// TODO Auto-generated method stub
		List<User> usr = userDao.findUserByName(username);
		return usr.size() > 0;
	}

	@Override
	@Transactional
	public void createUser(User user, Set<Long> authorityNumbers) {
		// TODO Auto-generated method stub
		user.setPassword(Constants.PASSWORD);
		user.setAuthority(sumAuthority(authorityNumbers));
		userDao.saveOrUpdateUser(user);
	}

	@Override
	@Transactional
	public void editUser(User user, Set<Long> authorityNumbers) {
		// TODO Auto-generated method stub
		User usr = userDao.findUserByName(user.getUsername()).get(0);
		usr.setAuthority(sumAuthority(authorityNumbers));
		usr.setRole(user.getRole());
		userDao.saveOrUpdateUser(usr);
	}
	
	private Long sumAuthority(Set<Long> authorityNumbers) {
		Long authority = 0l;
		for (Long item : authorityNumbers) {
			authority = authority | item;
		}
		return authority;
	}

	@Override
	public void resetPasswordByName(String username) {
		userDao.resetPasswordByName(username);
	}
	
	@Override
	@Transactional(readOnly = true)
	public User findUserByName(String username) {
		// TODO Auto-generated method stub
		List<User> usr = userDao.findUserByName(username);
		return usr.size() > 0 ? usr.get(0) : null;
	}

	@Override
	@Transactional(readOnly = true)
	public List<User> findUserByNameOrRoleWithPage(String username, String role, int page, int pageSize) {
		// TODO Auto-generated method stub
		return userDao.findUserByNameOrRoleWithPage(username, role, page, pageSize);
	}

	@Override
	@Transactional(readOnly = true)
	public int countUserWithNameOrRole(String username, String role) {
		// TODO Auto-generated method stub
		return userDao.countUserWithNameOrRole(username, role);
	}

	@Override
	@Transactional
	public void refreshFreeze() {
		// TODO Auto-generated method stub
		userDao.refreshFreeze();
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
