package com.airwxtx.user.service;

import java.util.List;

import com.airwxtx.user.entity.User;

public interface UserService {
	/**
	 * 创建用户
	 * @param user
	 * @param authorities
	 */
	void saveUser(User user , List<Long> authorities);
	
	/**
	 * 修改用户
	 * @param user
	 * @param autorities
	 */
	void updateUser(User user, List<Long> authorities);

}
