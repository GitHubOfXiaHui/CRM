package com.airwxtx.card.action;

public interface CardAction {

	/**
	 * 按卡号和/或手机号查找会员卡
	 * 
	 * @return
	 * @throws Exception
	 */
	public String searchCard() throws Exception;

	/**
	 * 加载会员卡
	 * 
	 * @throws Exception
	 */
	public String cardDetails() throws Exception;

	/**
	 * 冻结会员卡
	 * 
	 * @return
	 * @throws Exception
	 */
	public String freezeCard() throws Exception;

	/**
	 * 解冻会员卡
	 * 
	 * @return
	 * @throws Exception
	 */
	public String unfreezeCard() throws Exception;

	/**
	 * 充值
	 * 
	 * @return
	 * @throws Exception
	 */
	public String cardCharge() throws Exception;

	/**
	 * 进入扣款页面
	 * 
	 * @return
	 * @throws Exception
	 */
	public String preCardPay() throws Exception;

	/**
	 * 扣款
	 * 
	 * @return
	 * @throws Exception
	 */
	public String cardPay() throws Exception;

}
