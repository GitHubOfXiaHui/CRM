package com.airwxtx.client.service;

import java.util.List;

import com.airwxtx.client.entity.Client;

public interface ClientService {
	
	
	/**
	 * 根据公司查找客户
	 * @param company
	 * @return
	 */
	//List<Client> searchClientByCompany(String company);
	
	/**
	 * 列出所有用户
	 * @param 
	 * @return
	 */
	List<Client> listAllClients();
	
	/**
	 * 加载客户详情
	 * @param clientId
	 * @return
	 */
	Client getClient(Integer clientId);
	
	/**
	 * 添加客户
	 * @param client
	 */
	boolean saveClient(Client client);
	
	/**
	 * 修改客户信息
	 * @param client
	 */
	void updateClient(Client client);
	
	/**
	 * 删除客户
	 * @param client
	 */
	void deleteClient(Client client);
	
	/**
	 * 按客户名查找客户
	 * @param clientname
	 * @return
	 */
	List<Client> searchClientByClientname(String clientname);
}
