package com.airwxtx.recode.service;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import com.airwxtx.recode.entity.Recode;

public interface RecodeService {

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
	 * 导出消费记录
	 * 
	 * @param filepath
	 */
	public void exportXlsx(OutputStream out) throws IOException;

	/**
	 * 判断能否删除消费记录
	 * 
	 * @param recode
	 * @param username
	 * @return
	 */
	public boolean canDeleteRecode(Recode recode, String username);

}
