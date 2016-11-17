package com.airwxtx.card.dao;

import java.util.List;

import com.airwxtx.card.entity.Card;

public interface CardDao {

	/**
	 * 修改余额
	 * 
	 * @param money
	 * @param card
	 */
	public void updateCardBalance(Card card, Double money);

	/**
	 * 修改余额
	 * 
	 * @param cardId
	 * @param money
	 */
	public void updateCardBalance(Integer cardId, Double money);

	/**
	 * 按卡号和/或手机号分页查询会员卡
	 * 
	 * @param cardNo
	 * @param status
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public List<Card> findCardByCardNoOrPhoneWithPage(String cardNo, String status, int page, int pageSize);

	/**
	 * 按卡号和/或手机号统计会员卡数量
	 * 
	 * @param cardNo
	 * @param status
	 * @return
	 */
	public int countUserWithCardNoOrPhone(String cardNo, String status);

	/**
	 * 创建
	 * 
	 * @param card
	 */
	public Integer saveCard(Card card);

	/**
	 * 加载
	 * 
	 * @param id
	 * @return
	 */
	public Card loadCard(Integer id);

	/**
	 * 冻结会员卡
	 * 
	 * @param cardId
	 */
	public void updateCardStatus(Integer cardId, String cardStatus);

}
