package com.airwxtx.login.action;

public interface LoginAction {

	/**
	 * �����¼ҳ��
	 * @return
	 * @throws Exception
	 */
	public String preLogin() throws Exception;
	
	/**
	 * ��¼�ɹ�������ҳ���������ڵ�¼ҳ��
	 * @return
	 * @throws Exception
	 */
	public String login() throws Exception;
	
}
