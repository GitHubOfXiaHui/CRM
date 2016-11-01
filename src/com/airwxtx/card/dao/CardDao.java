package com.airwxtx.card.dao;

import com.airwxtx.card.entity.Card;

public interface CardDao {

	/**
	 * ��ֵ
	 * 
	 * @param money
	 * @param card
	 */
	public void addMoneyTo(Double money, Card card);
	
	/**
	 * ����
	 * @param card
	 */
	public void saveCard(Card card);
	
	/**
	 * �޸�
	 * @param card
	 */
	public void updateCard(Card card);
	
	/**
	 * ����
	 * @param id
	 * @return
	 */
	public Card loadCard(Integer id);
}
