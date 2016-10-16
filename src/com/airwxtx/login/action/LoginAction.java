package com.airwxtx.login.action;

public interface LoginAction {

	/**
	 * 进入登录页面
	 * @return
	 * @throws Exception
	 */
	public String preLogin() throws Exception;
	
	/**
	 * 登录成功进入主页，否则留在登录页面
	 * @return
	 * @throws Exception
	 */
	public String login() throws Exception;
	
}
