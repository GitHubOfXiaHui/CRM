package com.airwxtx.recode.action;

public interface RecodeAction {

	/**
	 * �г����Ѽ�¼����ҳ��
	 * 
	 * @return
	 * @throws Exception
	 */
	public String searchRecode() throws Exception;

	/**
	 * ��ʾ���Ѽ�¼����
	 * 
	 * @return
	 * @throws Exception
	 */
	public String detail() throws Exception;

	/**
	 * ɾ�����Ѽ�¼
	 * 
	 * @return
	 * @throws Exception
	 */
	public String delete() throws Exception;

	/**
	 * �������Ѽ�¼
	 * 
	 * @return
	 * @throws Exception
	 */
	public String exportRecode() throws Exception;
}
