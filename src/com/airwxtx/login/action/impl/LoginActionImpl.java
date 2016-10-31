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

	@Override
	public String preLogin() throws Exception {
		return INPUT;
	}

	/**
	 * 登录验证
	 * 
	 * @throws Exception
	 */
	public void validateLogin() throws Exception {
<<<<<<< HEAD
		if(user == null || user.getUsername() == null)
			this.addFieldError("user", "");
		if (!loginService.canLogin(user)) {
=======
		if (user == null || user.getUsername() == null) {
			this.addActionError("请先登录");
		} else if (!loginService.canLogin(user)) {
>>>>>>> 0d269e38d0ebf5c2566073de7604380d7e124117
			this.addFieldError("user", "用户名不存在或密码错误");
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

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

}
