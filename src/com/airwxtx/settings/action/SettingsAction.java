package com.airwxtx.settings.action;

public interface SettingsAction {

	public String profile() throws Exception;
	
	/**
	 * 打开修改密码页面
	 * @return
	 * @throws Exception
	 */
	public String preChangePassword() throws Exception;
	
	/**
	 * 修改密码
	 * @return
	 * @throws Exception
	 */
	public String changePassword() throws Exception;
	
	/**
	 * 退出登录
	 * @return
	 * @throws Exception
	 */
	public String exit() throws Exception;
	
}