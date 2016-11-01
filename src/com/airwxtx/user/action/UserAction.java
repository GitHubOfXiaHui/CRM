package com.airwxtx.user.action;

public interface UserAction {

	/**
	 * �鿴�û�����
	 * 
	 * @return
	 * @throws Exception
	 */
	public String userDetails() throws Exception;

	/**
	 * ���봴���û�ҳ��
	 * 
	 * @return
	 * @throws Exception
	 */
	public String preCreateUser() throws Exception;

	/**
	 * �����û�
	 * 
	 * @return
	 * @throws Exception
	 */
	public String createUser() throws Exception;

	/**
	 * ����༭�û�ҳ��
	 * 
	 * @return
	 * @throws Exception
	 */
	public String preEditUser() throws Exception;

	/**
	 * �༭�û�
	 * 
	 * @return
	 * @throws Exception
	 */
	public String editUser() throws Exception;

	/**
	 * ��������
	 * 
	 * @return
	 * @throws Exception
	 */
	public String resetPassword() throws Exception;

	/**
	 * �г��û�����ҳ��
	 * 
	 * @return
	 * @throws Exception
	 */
	public String searchUser() throws Exception;

}
