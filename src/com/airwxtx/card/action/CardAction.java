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
	 * 进入创建页面
	 * 
	 * @return
	 * @throws Exception
	 */
	public String preSave() throws Exception;

	/**
	 * 创建会员卡
	 * 
	 * @return
	 */
	public String saveCard() throws Exception;

	/**
	 * 进入修改页面
	 * 
	 * @return
	 * @throws Exception
	 */
	public String preUpdate() throws Exception;

	/**
	 * 修改会员卡
	 * 
	 * @return
	 * @throws Exception
	 */
	public String update() throws Exception;

	/**
	 * 加载会员卡
	 * 
	 * @throws Exception
	 */
	public String loadCard() throws Exception;

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
