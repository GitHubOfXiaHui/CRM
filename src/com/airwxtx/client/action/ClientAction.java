package com.airwxtx.client.action;

public interface ClientAction {
	/**
	 * �������ҳ��
	 * @return
	 * @throws Exception
	 */
	public String preSaveClient() throws Exception;
	
	/**
	 * ��ӿͻ�
	 * @return
	 * @throws Exception
	 */
	public void saveClient() throws Exception;
	
	/**
	 * �����޸Ŀͻ�
	 * @return
	 * @throws Exception
	 */
	public String preUpdateClient() throws Exception;
	
	/**
	 * �޸Ŀͻ�
	 * @return
	 * @throws Exception
	 */
	public void updateClient() throws Exception;
	
	/**
	 * ɾ���ͻ�
	 * @return
	 * @throws Exception
	 */
	public String deleteClient() throws Exception;
	
	/**
	 * �����ͻ�
	 * @return
	 * @throws Exception
	 */
	public String searchClient() throws Exception;
	
	/**
	 * �г����пͻ�
	 * @return
	 * @throws Exception
	 */
	public String listAllClients() throws Exception;
	
	/**
	 * �鿴�ͻ�
	 * @return
	 * @throws Exception
	 */
	public String showClientDetails() throws Exception;
}
