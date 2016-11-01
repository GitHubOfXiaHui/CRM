package com.airwxtx.card.dao;

import com.airwxtx.card.entity.Card;

public interface CardDao {

	/**
	 * 充值
	 * 
	 * @param money
	 * @param card
	 */
	public void addMoneyTo(Double money, Card card);
	
	/**
	 * 创建
	 * @param card
	 */
	public void saveCard(Card card);
	
	/**
	 * 修改
	 * @param card
	 */
	public void updateCard(Card card);
	
	/**
	 * 加载
	 * @param id
	 * @return
	 */
	public Card loadCard(Integer id);
}
