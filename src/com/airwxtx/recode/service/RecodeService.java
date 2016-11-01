package com.airwxtx.recode.service;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import com.airwxtx.recode.entity.Recode;

public interface RecodeService {

	/**
	 * ����Ա��λ��������ҳ��ѯ���Ѽ�¼
	 * 
	 * @param company
	 * @param name
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public List<Recode> findRecodeByCompanyOrNameWithPage(String company, String name, int page, int pageSize);

	/**
	 * ����Ա��λ������ͳ�����Ѽ�¼����
	 * 
	 * @param company
	 * @param name
	 * @return
	 */
	public int countUserWithCompanyOrName(String company, String name);

	/**
	 * �������Ѽ�¼
	 * 
	 * @param id
	 * @return
	 */
	public Recode loadRecode(Integer id);

	/**
	 * ɾ�����Ѽ�¼
	 * 
	 * @param recodeId
	 */
	public void deleteRecode(Integer recodeId);

	/**
	 * �������Ѽ�¼
	 * 
	 * @param filepath
	 */
	public void exportXlsx(OutputStream out) throws IOException;

}
