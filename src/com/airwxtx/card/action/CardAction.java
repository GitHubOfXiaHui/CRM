package com.airwxtx.card.action;

public interface CardAction {
	/**
	 * 进入创建页面
	 * @return
	 * @throws Exception
	 */
	public String preSave() throws Exception;
	
	/**
	 * 创建会员卡
	 * @return
	 */
	public String saveCard() throws Exception;
	
	/**
	 * 进入修改页面
	 * @return
	 * @throws Exception
	 */
	public String preUpdate() throws Exception;
	
	/**
	 * 修改会员卡
	 * @return
	 * @throws Exception
	 */
	public String update() throws Exception;
}
