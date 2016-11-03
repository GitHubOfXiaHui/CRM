package com.airwxtx.client.service;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import com.airwxtx.client.entity.Client;

public interface ClientService {	
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
	 * ���ҿͻ�
	 * @param name
	 * @param phone
	 * @param company
	 * @param card
	 * @param page
	 * @param pageSize
	 * @return
	 */
	List<Client> searchClientByNameOrPhoneOrCompanyOrCardWithPage(String name,String phone,String company,String card,int page,int pageSize);
	
	/**
	 * ͳ����Ŀ
	 * @param name
	 * @param phone
	 * @param company
	 * @param card
	 * @return
	 */
	int countClientByNameOrPhoneOrCompanyOrCardWithPage(String name,String phone,String company,String card);
	
	/**
	 * ������Ա�б�
	 * 
	 * @param filepath
	 */
	public void exportXlsx(OutputStream out) throws IOException;
}
