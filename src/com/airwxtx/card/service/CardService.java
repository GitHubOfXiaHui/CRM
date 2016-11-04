package com.airwxtx.card.service;

import java.util.List;

import com.airwxtx.card.entity.Card;
import com.airwxtx.recode.entity.Recode;

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

	/**
	 * 加载会员卡
	 * 
	 * @param id
	 * @return
	 */
	public Card loadCard(Integer id);

	/**
	 * 创建会员卡
	 * 
	 * @param card
	 */
	public void saveCard(Card card);

	/**
	 * 修改会员卡
	 * 
	 * @param card
	 */
	public void updateCard(Card card);

	/**
	 * 判断该用户是否具有冻结权限
	 * 
	 * @param username
	 * @return
	 */
	public boolean canFreezeCard(String username);

	/**
	 * 冻结会员卡
	 * 
	 * @param cardId
	 * @param username
	 */
	public void freezeCard(Integer cardId, String username);

	/**
	 * 解冻会员卡
	 * 
	 * @param cardId
	 */
	public void unfreezeCard(Integer cardId);

	/**
	 * 充值
	 * 
	 * @param cardId
	 * @param money
	 */
	public void charge(Integer cardId, double money);

	/**
	 * 扣款
	 * 
	 * @param card
	 * @param recode
	 */
	public void pay(Card card, Recode recode);

}
