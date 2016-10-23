package com.airwxtx.client.dao;

import java.util.List;

import com.airwxtx.client.entity.Client;

public interface ClientDao {
	/**
	 * ���ݿͻ����Ʋ��ҿͻ�
	 * 
	 * @param clientname
	 *            �ͻ���
	 * @return List<Client> �ͻ��б�
	 */
	public List<Client> searchClientByClientname(String clientname);

	/**
	 * ���ݹ�˾�����ҿͻ�
	 * 
	 * @param company
	 * @return List<Client> �ͻ��б�
	 */
	public List<Client> searchClientByCompany(String company);

	/**
	 * �г����пͻ�
	 * 
	 * @return List<Client> �ͻ��б�
	 */
	public List<Client> listAllClients();

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
}
