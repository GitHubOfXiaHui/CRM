package com.airwxtx.card.dao;

import java.util.List;

import com.airwxtx.card.entity.Card;

public interface CardDao {

	/**
	 * �޸����
	 * 
	 * @param money
	 * @param card
	 */
	public void updateCardBalance(Card card, Double money);

	/**
	 * �޸����
	 * 
	 * @param cardId
	 * @param money
	 */
	public void updateCardBalance(Integer cardId, Double money);

	/**
	 * �����ź�/���ֻ��ŷ�ҳ��ѯ��Ա��
	 * 
	 * @param cardNo
	 * @param status
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public List<Card> findCardByCardNoOrPhoneWithPage(String cardNo, String status, int page, int pageSize);

	/**
	 * �����ź�/���ֻ���ͳ�ƻ�Ա������
	 * 
	 * @param cardNo
	 * @param status
	 * @return
	 */
	public int countUserWithCardNoOrPhone(String cardNo, String status);

	/**
	 * ����
	 * 
	 * @param card
	 */
	public Integer saveCard(Card card);

	/**
	 * ����
	 * 
	 * @param id
	 * @return
	 */
	public Card loadCard(Integer id);

	/**
	 * �����Ա��
	 * 
	 * @param cardId
	 */
	public void updateCardStatus(Integer cardId, String cardStatus);

}
