package com.airwxtx.settings.service;

import com.airwxtx.user.entity.User;

public interface SettingsService {

	/**
	 * �����û��������û�
	 * @param username
	 * @return
	 */
	User findUser(String username);

}
