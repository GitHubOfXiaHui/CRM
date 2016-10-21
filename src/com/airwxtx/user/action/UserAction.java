package com.airwxtx.user.action;

public interface UserAction {
	/**
	 * 进入创建用户页面
	 * @return
	 * @throws Exception
	 */
	public String preSave() throws Exception;
	
	/**
	 * 创建用户
	 * @return
	 * @throws Exception
	 */
	public String saveUser() throws Exception;
	
	/**
	 * 更新用户
	 * @return
	 * @throws Exception
	 */
	public String updateUser() throws Exception;
	
	/**
	 * 列出所有用户
	 * @return
	 * @throws Exception
	 */
	public String listAllUsers() throws Exception;

}
