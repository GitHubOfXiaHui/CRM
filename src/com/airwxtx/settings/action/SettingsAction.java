package com.airwxtx.settings.action;

public interface SettingsAction {

	public String profile() throws Exception;
	
	/**
	 * ���޸�����ҳ��
	 * @return
	 * @throws Exception
	 */
	public String preChangePassword() throws Exception;
	
	/**
	 * �޸�����
	 * @return
	 * @throws Exception
	 */
	public String changePassword() throws Exception;
	
	/**
	 * �˳���¼
	 * @return
	 * @throws Exception
	 */
	public String exit() throws Exception;
	
}