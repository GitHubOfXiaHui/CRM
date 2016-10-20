package com.airwxtx.client.dao;

import java.util.List;

import com.airwxtx.client.entity.Client;

public interface ClientDao {
	/**
	 * ���ݿͻ����Ʋ��ҿͻ�
	 * @param clientname �ͻ���
	 * @return List<Client> �ͻ��б�
	 */
	List<Client> searchClientByClientname(String clientname);
	
	/**
	 * ���ݹ�˾�����ҿͻ�
	 * @param company
	 * @return List<Client> �ͻ��б�
	 */
	List<Client> searchClientByCompany(String company);
	
	/**
	 * �г����пͻ�
	 * @return List<Client> �ͻ��б�
	 */
	List<Client> listAllClients();
	
	/**
	 * ���¿ͻ���Ϣ
	 * @param client
	 * @return boolean 
	 */
	void updateClient(Client client);
	
	/**
	 * ��ӿͻ�
	 * @param client
	 * @return �ͻ�ID
	 */
	Integer saveClient(Client client);
	
	/**
	 * ɾ���ͻ�
	 * @param client
	 * @return boolean
	 */
	void deleteClient(Client client);
	
	/**
	 * ���ؿͻ�
	 * @param clientId
	 * @return client
	 */
	Client getClient(Integer clientId);
}
