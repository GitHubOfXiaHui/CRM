package com.airwxtx.login.service;

import com.airwxtx.user.entity.User;

public interface LoginService {

	/**
	 * ��֤�û��Ƿ�Ϸ�
	 * 
	 * @param user
	 * @return
	 */
	boolean canLogin(User user);

}
