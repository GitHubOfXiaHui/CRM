package com.airwxtx.login.action.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.airwxtx.login.action.LoginAction;
import com.airwxtx.user.entity.User;
import com.airwxtx.user.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller("loginAction")
@Scope("prototype")
public class LoginActionImpl extends ActionSupport implements LoginAction {
	// �û�
	private User user;
	
	@Autowired
	private UserService userService;

	@Override
	public String preLogin() throws Exception {
		return INPUT;
	}

	/**
	 * ��¼��֤
	 * 
	 * @throws Exception
	 */
	public void validateLogin() throws Exception {
		if (user == null || user.getUsername() == null) {
			this.addActionError("���ȵ�¼");
		} else if (!userService.canLogin(user)) {
			this.addFieldError("user", "�û��������ڻ��������");
		}
	}

	@Override
	public String login() throws Exception {
		ActionContext.getContext().getSession().put("user", user.getUsername());
		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
