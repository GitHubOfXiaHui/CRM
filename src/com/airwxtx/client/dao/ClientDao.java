package com.airwxtx.client.dao;

import java.util.List;

import com.airwxtx.client.entity.Client;

public interface ClientDao {
	/**
	 * ���¿ͻ���Ϣ
	 * 
	 * @param client
	 * @return boolean
	 */
	public void updateClient(Client client);

	/**
	 * ��ӿͻ�
	 * 
	 * @param client
	 * @return �ͻ�ID
	 */
	public Integer saveClient(Client client);

	/**
	 * ɾ���ͻ�
	 * 
	 * @param client
	 * @return boolean
	 */
	public void deleteClient(Client client);

	/**
	 * ���ؿͻ�
	 * 
	 * @param clientId
	 * @return client
	 */
	public Client getClient(Integer clientId);
	
	/**
	 * ���ҿͻ�
	 * @param name
	 * @param phone
	 * @param company
	 * @param card
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public List<Client> searchClientByNameOrPhoneOrCompanyOrCardWithPage(String name,String phone,String company,String card,int page,int pageSize);

	/**
	 * ͳ����Ŀ
	 * @param name
	 * @param phone
	 * @param company
	 * @param card
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public int countClientByNameOrPhoneOrCompanyOrCardWithPage(String name,String phone,String company,String card);
	
	/**
	 * �������л�Ա
	 * @return
	 */
	public List<Client> loadAll();
}
