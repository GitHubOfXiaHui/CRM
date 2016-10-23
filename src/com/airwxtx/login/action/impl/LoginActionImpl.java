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
	// �û�
	private User user;

	@Autowired
	private LoginService loginService;

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
		if (!loginService.canLogin(user)) {
			this.addFieldError("user", "�û��������ڻ��������");
			user.setPassword("");
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
