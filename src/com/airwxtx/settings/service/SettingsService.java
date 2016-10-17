package com.airwxtx.settings.service;

import com.airwxtx.user.entity.User;

public interface SettingsService {

	/**
	 * 根据用户名查找用户
	 * @param username
	 * @return
	 */
	User findUser(String username);

}
