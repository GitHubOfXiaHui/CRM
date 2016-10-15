package com.airwxtx.login.action.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.airwxtx.login.action.LoginAction;
import com.airwxtx.user.entity.User;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller("loginAction")
@Scope("prototype")
public class LoginActionImpl extends ActionSupport implements LoginAction {
	// �û�
	private User user;
	// �û��Ƿ����
	private boolean usernameError = false;
	// �����Ƿ���ȷ
	private boolean passwordError = false;
	
	public String preLogin() throws Exception {
		return LOGIN;
	}
	
	public String login() throws Exception {
		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean isUsernameError() {
		return usernameError;
	}

	public void setUsernameError(boolean usernameError) {
		this.usernameError = usernameError;
	}

	public boolean isPasswordError() {
		return passwordError;
	}

	public void setPasswordError(boolean passwordError) {
		this.passwordError = passwordError;
	}
	
}
