package com.airwxtx.quartz;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.airwxtx.user.service.UserService;

public class RefreshFreeze {
	@Autowired
	private UserService userService;

	/**
	 * ÿ��12��ˢ�¶���Ȩ��
	 * 
	 * @throws Exception
	 */
	public void execute() throws Exception {
		System.out.println("ˢ�¶���Ȩ��[" + new Date() + "]");
		this.userService.refreshFreeze();
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
