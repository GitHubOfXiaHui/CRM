package com.airwxtx.client.dao;

import java.util.List;

import com.airwxtx.client.entity.Client;

public interface ClientDao {
	/**
	 * 根据客户名称查找客户
	 * 
	 * @param clientname
	 *            客户名
	 * @return List<Client> 客户列表
	 */
	public List<Client> searchClientByClientname(String clientname);

	/**
	 * 根据公司名查找客户
	 * 
	 * @param company
	 * @return List<Client> 客户列表
	 */
	public List<Client> searchClientByCompany(String company);

	/**
	 * 列出所有客户
	 * 
	 * @return List<Client> 客户列表
	 */
	public List<Client> listAllClients();

	/**
	 * 更新客户信息
	 * 
	 * @param client
	 * @return boolean
	 */
	public void updateClient(Client client);

	/**
	 * 添加客户
	 * 
	 * @param client
	 * @return 客户ID
	 */
	public Integer saveClient(Client client);

	/**
	 * 删除客户
	 * 
	 * @param client
	 * @return boolean
	 */
	public void deleteClient(Client client);

	/**
	 * 加载客户
	 * 
	 * @param clientId
	 * @return client
	 */
	public Client getClient(Integer clientId);
}
