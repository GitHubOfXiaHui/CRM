package com.airwxtx.card.service;

import java.util.List;

import com.airwxtx.card.entity.Card;

public interface CardService {

	/**
	 * 按卡号和/或手机号分页查询会员卡
	 * 
	 * @param cardNo
	 * @param phone
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public List<Card> findCardByCardNoOrPhoneWithPage(String cardNo, String phone, int page, int pageSize);

	/**
	 * 统计会员卡数量
	 * 
	 * @param cardNo
	 * @param phone
	 * @return
	 */
	public int countUserWithCardNoOrPhone(String cardNo, String phone);

}
