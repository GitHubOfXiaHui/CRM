package com.airwxtx.settings.service;

import com.airwxtx.user.entity.User;

public interface SettingsService {

	/**
	 * �����û��������û�
	 * 
	 * @param username
	 * @return
	 */
	public User findUser(String username);

	/**
	 * �޸�����
	 * 
	 * @param username
	 * @param newPassword
	 */
	public void changePassword(String username, String newPassword);

}
