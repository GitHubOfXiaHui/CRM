package com.airwxtx.card.service;

import com.airwxtx.card.entity.Card;

public interface CardService {
	/**
	 * ���ػ�Ա��
	 * @param id
	 * @return
	 */
	public Card loadCard(Integer id);
	
	/**
	 * ������Ա��
	 * @param card
	 */
	public void saveCard(Card card);
	
	/**
	 * �޸Ļ�Ա��
	 * @param card
	 */
	public void updateCard(Card card);
}
