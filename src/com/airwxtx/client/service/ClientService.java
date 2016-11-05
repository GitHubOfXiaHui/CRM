package com.airwxtx.client.service;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import com.airwxtx.client.entity.Client;

public interface ClientService {
	
	/**
	 * 加载客户详情
	 * 
	 * @param clientId
	 * @return
	 */
	public Client loadClient(Integer clientId);

	/**
	 * 添加客户
	 * 
	 * @param client
	 */
	public void saveClient(Client client);

	/**
	 * 修改客户信息
	 * 
	 * @param client
	 */
	public void updateClient(Client client);

	/**
	 * 查找客户
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
	 * 统计数目
	 * 
	 * @param name
	 * @param phone
	 * @param company
	 * @param card
	 * @return
	 */
	public int countClientByNameOrPhoneOrCompanyOrCardNo(String name, String phone, String company, String card);

	/**
	 * 导出会员列表
	 * 
	 * @param filepath
	 */
	public void exportXlsx(OutputStream out) throws IOException;
}
