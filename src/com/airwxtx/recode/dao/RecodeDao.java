package com.airwxtx.recode.dao;

import java.util.List;

import com.airwxtx.recode.entity.Recode;

public interface RecodeDao {

	/**
	 * ������ź�/���г̷�ҳ��ѯ���Ѽ�¼
	 * 
	 * @param fltNo
	 * @param route
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public List<Recode> findRecodeByFltNoOrRouteWithPage(String fltNo, String route, int page, int pageSize);

	/**
	 * ������ź�/���г�ͳ�����Ѽ�¼����
	 * 
	 * @param fltNo
	 * @param route
	 * @return
	 */
	public int countRecodeWithFltNoOrRoute(String fltNo, String route);

	/**
	 * �������Ѽ�¼
	 * 
	 * @param id
	 * @return
	 */
	public Recode loadRecode(Integer recodeId);

	/**
	 * ɾ�����Ѽ�¼
	 * 
	 * @param recodeId
	 */
	public void deleteRecode(Recode recode);

	/**
	 * �����������Ѽ�¼
	 * 
	 * @return
	 */
	public List<Recode> loadAllRecodes();

	/**
	 * �������Ѽ�¼
	 * 
	 * @param recode
	 */
	public void save(Recode recode);

}
