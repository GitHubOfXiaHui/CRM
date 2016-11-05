package com.airwxtx.client.service;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import com.airwxtx.client.entity.Client;

public interface ClientService {
	
	/**
	 * ���ؿͻ�����
	 * 
	 * @param clientId
	 * @return
	 */
	public Client loadClient(Integer clientId);

	/**
	 * ��ӿͻ�
	 * 
	 * @param client
	 */
	public void saveClient(Client client);

	/**
	 * �޸Ŀͻ���Ϣ
	 * 
	 * @param client
	 */
	public void updateClient(Client client);

	/**
	 * ���ҿͻ�
	 * 
	 * @param name
	 * @param phone
	 * @param company
	 * @param card
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public List<Client> searchClientByNameOrPhoneOrCompanyOrCardNoWithPage(String name, String phone, String company,
			String card, int page, int pageSize);

	/**
	 * ͳ����Ŀ
	 * 
	 * @param name
	 * @param phone
	 * @param company
	 * @param card
	 * @return
	 */
	public int countClientByNameOrPhoneOrCompanyOrCardNo(String name, String phone, String company, String card);

	/**
	 * ������Ա�б�
	 * 
	 * @param filepath
	 */
	public void exportXlsx(OutputStream out) throws IOException;
}
