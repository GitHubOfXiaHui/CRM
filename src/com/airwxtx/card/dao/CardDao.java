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

}
