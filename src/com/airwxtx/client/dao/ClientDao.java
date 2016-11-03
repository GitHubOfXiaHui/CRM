package com.airwxtx.client.dao;

import java.util.List;

import com.airwxtx.client.entity.Client;

public interface ClientDao {
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
	
	/**
	 * 查找客户
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
	 * 统计数目
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
	 * 加载所有会员
	 * @return
	 */
	public List<Client> loadAll();
}
