package com.airwxtx.login.service;

import com.airwxtx.user.entity.User;

public interface LoginService {

	/**
	 * 验证用户是否合法
	 * 
	 * @param user
	 * @return
	 */
	boolean canLogin(User user);

}
