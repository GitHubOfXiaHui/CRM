package com.airwxtx.user.dao;

import java.util.List;

import com.airwxtx.user.entity.User;

public interface UserDao {

	/**
	 * �����û��������û�
	 * @param username
	 * @return
	 */
	List<User> findByUsername(String username);

}
