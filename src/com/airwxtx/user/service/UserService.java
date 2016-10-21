package com.airwxtx.user.service;

import java.util.List;

import com.airwxtx.user.entity.User;

public interface UserService {
	/**
	 * �����û�
	 * @param user
	 * @param authorities
	 */
	void saveUser(User user , List<Long> authorities);
	
	/**
	 * �޸��û�
	 * @param user
	 * @param autorities
	 */
	void updateUser(User user, List<Long> authorities);

}
