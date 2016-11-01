package com.airwxtx.user.action;

public interface UserAction {

	/**
	 * 查看用户详情
	 * 
	 * @return
	 * @throws Exception
	 */
	public String userDetails() throws Exception;

	/**
	 * 进入创建用户页面
	 * 
	 * @return
	 * @throws Exception
	 */
	public String preCreateUser() throws Exception;

	/**
	 * 创建用户
	 * 
	 * @return
	 * @throws Exception
	 */
	public String createUser() throws Exception;

	/**
	 * 进入编辑用户页面
	 * 
	 * @return
	 * @throws Exception
	 */
	public String preEditUser() throws Exception;

	/**
	 * 编辑用户
	 * 
	 * @return
	 * @throws Exception
	 */
	public String editUser() throws Exception;

	/**
	 * 重置密码
	 * 
	 * @return
	 * @throws Exception
	 */
	public String resetPassword() throws Exception;

	/**
	 * 列出用户（分页）
	 * 
	 * @return
	 * @throws Exception
	 */
	public String searchUser() throws Exception;

}
