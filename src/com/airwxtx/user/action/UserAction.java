package com.airwxtx.user.action;

public interface UserAction {
	/**
	 * ���봴���û�ҳ��
	 * @return
	 * @throws Exception
	 */
	public String preSave() throws Exception;
	
	/**
	 * �����û�
	 * @return
	 * @throws Exception
	 */
	public String saveUser() throws Exception;
	
	/**
	 * �����û�
	 * @return
	 * @throws Exception
	 */
	public String updateUser() throws Exception;
	
	/**
	 * �г������û�
	 * @return
	 * @throws Exception
	 */
	public String listAllUsers() throws Exception;

}
