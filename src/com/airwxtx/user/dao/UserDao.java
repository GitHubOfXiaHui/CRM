package com.airwxtx.user.dao;

import java.util.List;

import com.airwxtx.user.entity.User;

public interface UserDao {

	/**
	 * 根据用户名查找用户
	 * @param username
	 * @return
	 */
	List<User> findByUsername(String username);

}
