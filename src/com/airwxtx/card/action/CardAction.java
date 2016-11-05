package com.airwxtx.card.action;

public interface CardAction {

	/**
	 * �����ź�/���ֻ��Ų��һ�Ա��
	 * 
	 * @return
	 * @throws Exception
	 */
	public String searchCard() throws Exception;

	/**
	 * ���ػ�Ա��
	 * 
	 * @throws Exception
	 */
	public String cardDetails() throws Exception;

	/**
	 * �����Ա��
	 * 
	 * @return
	 * @throws Exception
	 */
	public String freezeCard() throws Exception;

	/**
	 * �ⶳ��Ա��
	 * 
	 * @return
	 * @throws Exception
	 */
	public String unfreezeCard() throws Exception;

	/**
	 * ��ֵ
	 * 
	 * @return
	 * @throws Exception
	 */
	public String cardCharge() throws Exception;

	/**
	 * ����ۿ�ҳ��
	 * 
	 * @return
	 * @throws Exception
	 */
	public String preCardPay() throws Exception;

	/**
	 * �ۿ�
	 * 
	 * @return
	 * @throws Exception
	 */
	public String cardPay() throws Exception;

}
