package com.airwxtx.client.action;

public interface ClientAction {
	/**
	 * 进入添加页面
	 * @return
	 * @throws Exception
	 */
	public String preSaveClient() throws Exception;
	
	/**
	 * 添加客户
	 * @return
	 * @throws Exception
	 */
	public String saveClient() throws Exception;
	
	/**
	 * 进入修改客户
	 * @return
	 * @throws Exception
	 */
	public String preUpdateClient() throws Exception;
	
	/**
	 * 修改客户
	 * @return
	 * @throws Exception
	 */
	public String updateClient() throws Exception;
	
	/**
	 * 删除客户
	 * @return
	 * @throws Exception
	 */
	public String deleteClient() throws Exception;
	
	/**
	 * 搜索客户
	 * @return
	 * @throws Exception
	 */
	public String searchClient() throws Exception;
	
	/**
	 * 查看客户
	 * @return
	 * @throws Exception
	 */
	public String showClientDetails() throws Exception;
	
	/**
	 * 导出会员
	 * @throws Exception
	 */
	public void exportClient() throws Exception;
}
