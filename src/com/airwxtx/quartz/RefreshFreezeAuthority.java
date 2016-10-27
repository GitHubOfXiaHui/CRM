package com.airwxtx.quartz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.airwxtx.user.entity.User;
import com.airwxtx.user.service.UserService;

public class RefreshFreezeAuthority {
	@Autowired
	private UserService userService;
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	/**
	 * ҵ��Աÿ��ֻ�ܶ������ſ�
	 * ÿ��ˢ�¶���Ȩ��
	 * @throws Exception
	 */
	public void refreshFreezeAuthority() throws Exception{
		List<User> users = this.userService.listAllUsers();
		for(User user : users)
		{
			user.setFreezeAuthority(2);
			this.userService.updateUser(user);
		}
	}

}
