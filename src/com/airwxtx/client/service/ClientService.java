package com.airwxtx.client.service;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import com.airwxtx.client.entity.Client;

public interface ClientService {	
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
	 * 查找客户
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
	 * 统计数目
	 * @param name
	 * @param phone
	 * @param company
	 * @param card
	 * @return
	 */
	int countClientByNameOrPhoneOrCompanyOrCardWithPage(String name,String phone,String company,String card);
	
	/**
	 * 导出会员列表
	 * 
	 * @param filepath
	 */
	public void exportXlsx(OutputStream out) throws IOException;
}
