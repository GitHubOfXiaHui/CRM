package com.airwxtx.client.service;

import java.util.List;

import com.airwxtx.client.entity.Client;

public interface ClientService {
	
	
	/**
	 * ���ݹ�˾���ҿͻ�
	 * @param company
	 * @return
	 */
	//List<Client> searchClientByCompany(String company);
	
	/**
	 * �г������û�
	 * @param 
	 * @return
	 */
	List<Client> listAllClients();
	
	/**
	 * ���ؿͻ�����
	 * @param clientId
	 * @return
	 */
	Client getClient(Integer clientId);
	
	/**
	 * ��ӿͻ�
	 * @param client
	 */
	boolean saveClient(Client client);
	
	/**
	 * �޸Ŀͻ���Ϣ
	 * @param client
	 */
	void updateClient(Client client);
	
	/**
	 * ɾ���ͻ�
	 * @param client
	 */
	void deleteClient(Client client);
	
	/**
	 * ���ͻ������ҿͻ�
	 * @param clientname
	 * @return
	 */
	List<Client> searchClientByClientname(String clientname);
}
