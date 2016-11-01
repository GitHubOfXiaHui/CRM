package com.airwxtx.card.service;

import com.airwxtx.card.entity.Card;

public interface CardService {
	/**
	 * 加载会员卡
	 * @param id
	 * @return
	 */
	public Card loadCard(Integer id);
	
	/**
	 * 创建会员卡
	 * @param card
	 */
	public void saveCard(Card card);
	
	/**
	 * 修改会员卡
	 * @param card
	 */
	public void updateCard(Card card);
}
