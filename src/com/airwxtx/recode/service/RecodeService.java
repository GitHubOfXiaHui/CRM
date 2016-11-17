package com.airwxtx.recode.service;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import com.airwxtx.recode.entity.Recode;

public interface RecodeService {

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
	 * �������Ѽ�¼
	 * 
	 * @param filepath
	 */
	public void exportXlsx(OutputStream out) throws IOException;

	/**
	 * �ж��ܷ�ɾ�����Ѽ�¼
	 * 
	 * @param recode
	 * @param username
	 * @return
	 */
	public boolean canDeleteRecode(Recode recode, String username);

}
