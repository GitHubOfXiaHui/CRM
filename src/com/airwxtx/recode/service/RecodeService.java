package com.airwxtx.recode.service;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import com.airwxtx.recode.entity.Recode;

public interface RecodeService {

	/**
	 * 按会员单位或姓名分页查询消费记录
	 * 
	 * @param company
	 * @param name
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public List<Recode> findRecodeByCompanyOrNameWithPage(String company, String name, int page, int pageSize);

	/**
	 * 按会员单位或姓名统计消费记录数量
	 * 
	 * @param company
	 * @param name
	 * @return
	 */
	public int countUserWithCompanyOrName(String company, String name);

	/**
	 * 加载消费记录
	 * 
	 * @param id
	 * @return
	 */
	public Recode loadRecode(Integer id);

	/**
	 * 删除消费记录
	 * 
	 * @param recodeId
	 */
	public void deleteRecode(Integer recodeId);

	/**
	 * 导出消费记录
	 * 
	 * @param filepath
	 */
	public void exportXlsx(OutputStream out) throws IOException;

}
