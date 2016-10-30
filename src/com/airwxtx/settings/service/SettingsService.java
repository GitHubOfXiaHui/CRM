package com.airwxtx.settings.service;

import com.airwxtx.user.entity.User;

public interface SettingsService {

	/**
	 * 根据用户名查找用户
	 * 
	 * @param username
	 * @return
	 */
	public User findUser(String username);

	/**
	 * 修改密码
	 * 
	 * @param username
	 * @param newPassword
	 */
	public void changePassword(String username, String newPassword);

}
