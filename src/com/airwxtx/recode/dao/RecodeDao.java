package com.airwxtx.recode.dao;

import java.util.List;

import com.airwxtx.recode.entity.Recode;

public interface RecodeDao {

	/**
	 * 按航班号和/或行程分页查询消费记录
	 * 
	 * @param fltNo
	 * @param route
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public List<Recode> findRecodeByFltNoOrRouteWithPage(String fltNo, String route, int page, int pageSize);

	/**
	 * 按航班号和/或行程统计消费记录数量
	 * 
	 * @param fltNo
	 * @param route
	 * @return
	 */
	public int countRecodeWithFltNoOrRoute(String fltNo, String route);

	/**
	 * 加载消费记录
	 * 
	 * @param id
	 * @return
	 */
	public Recode loadRecode(Integer recodeId);

	/**
	 * 删除消费记录
	 * 
	 * @param recodeId
	 */
	public void deleteRecode(Recode recode);

	/**
	 * 查找所有消费记录
	 * 
	 * @return
	 */
	public List<Recode> loadAllRecodes();

	/**
	 * 保存消费记录
	 * 
	 * @param recode
	 */
	public void save(Recode recode);

}
