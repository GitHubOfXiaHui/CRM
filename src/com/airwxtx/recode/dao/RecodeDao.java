package com.airwxtx.recode.dao;

import java.util.List;

import com.airwxtx.recode.entity.Recode;

public interface RecodeDao {

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
	 * 查找所有消费记录
	 * 
	 * @return
	 */
	public List<Recode> loadAllRecodes();

	/**
	 * 保存消费记录
	 * @param recode
	 */
	public void save(Recode recode);

}
