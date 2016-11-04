package com.airwxtx.recode.dao;

import java.util.List;

import com.airwxtx.recode.entity.Recode;

public interface RecodeDao {

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
	 * �����������Ѽ�¼
	 * 
	 * @return
	 */
	public List<Recode> loadAllRecodes();

	/**
	 * �������Ѽ�¼
	 * @param recode
	 */
	public void save(Recode recode);

}
