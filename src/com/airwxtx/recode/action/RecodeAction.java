package com.airwxtx.recode.action;

public interface RecodeAction {

	/**
	 * 列出消费记录（分页）
	 * 
	 * @return
	 * @throws Exception
	 */
	public String searchRecode() throws Exception;

	/**
	 * 显示消费记录详情
	 * 
	 * @return
	 * @throws Exception
	 */
	public String detail() throws Exception;

	/**
	 * 删除消费记录
	 * 
	 * @return
	 * @throws Exception
	 */
	public String delete() throws Exception;

	/**
	 * 导出消费记录
	 * 
	 * @return
	 * @throws Exception
	 */
	public String exportRecode() throws Exception;
}
