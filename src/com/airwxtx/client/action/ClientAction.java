package com.airwxtx.client.action;

public interface ClientAction {
	/**
	 * �������ҳ��
	 * 
	 * @return
	 * @throws Exception
	 */
	public String preSaveClient() throws Exception;

	/**
	 * ��ӿͻ�
	 * 
	 * @return
	 * @throws Exception
	 */
	public String saveClient() throws Exception;

	/**
	 * �����޸Ŀͻ�
	 * 
	 * @return
	 * @throws Exception
	 */
	public String preUpdateClient() throws Exception;

	/**
	 * �޸Ŀͻ�
	 * 
	 * @return
	 * @throws Exception
	 */
	public String updateClient() throws Exception;

	/**
	 * �����ͻ�
	 * 
	 * @return
	 * @throws Exception
	 */
	public String searchClient() throws Exception;

	/**
	 * �鿴�ͻ�
	 * 
	 * @return
	 * @throws Exception
	 */
	public String showClientDetails() throws Exception;

	/**
	 * ������Ա
	 * 
	 * @throws Exception
	 */
	public void exportClient() throws Exception;

	/**
	 * ������ӻ�Ա��ҳ��
	 * 
	 * @return
	 * @throws Exception
	 */
	public String preAddCard() throws Exception;

	/**
	 * ��ӻ�Ա��
	 * 
	 * @return
	 * @throws Exception
	 */
	public String addCard() throws Exception;

}
