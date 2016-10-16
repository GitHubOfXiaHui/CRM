package com.airwxtx.login.action.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.airwxtx.login.action.LoginAction;
import com.airwxtx.login.service.LoginService;
import com.airwxtx.user.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller("loginAction")
@Scope("prototype")
public class LoginActionImpl extends ActionSupport implements LoginAction {
	// 用户
	private User user;

	@Autowired
	private LoginService loginService;

	public String preLogin() throws Exception {
		return INPUT;
	}

	public String login() throws Exception {
		LOG.debug("Username: " + user.getUsername());
		LOG.debug("Password: " + user.getPassword());
		ActionContext.getContext().getSession().put("user", user.getUsername());
		return SUCCESS;
	}

	public void validateLogin() {
		if (!loginService.canLogin(user)) {
			this.addFieldError("user", "用户名不存在或密码错误");
			user.setPassword("");
		}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

}
