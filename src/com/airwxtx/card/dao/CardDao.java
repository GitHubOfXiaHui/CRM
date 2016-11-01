package com.airwxtx.card.dao;

import java.util.List;

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

	/**
	 * 创建
	 * 
	 * @param card
	 */
	public void saveCard(Card card);

	/**
	 * 修改
	 * 
	 * @param card
	 */
	public void updateCard(Card card);

	/**
	 * 加载
	 * 
	 * @param id
	 * @return
	 */
	public Card loadCard(Integer id);

}
