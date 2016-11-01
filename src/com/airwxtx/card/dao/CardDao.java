package com.airwxtx.card.dao;

import java.util.List;

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
	 * �����ź�/���ֻ��ŷ�ҳ��ѯ��Ա��
	 * 
	 * @param cardNo
	 * @param phone
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public List<Card> findCardByCardNoOrPhoneWithPage(String cardNo, String phone, int page, int pageSize);

	/**
	 * ͳ�ƻ�Ա������
	 * 
	 * @param cardNo
	 * @param phone
	 * @return
	 */
	public int countUserWithCardNoOrPhone(String cardNo, String phone);

	/**
	 * ����
	 * 
	 * @param card
	 */
	public void saveCard(Card card);

	/**
	 * �޸�
	 * 
	 * @param card
	 */
	public void updateCard(Card card);

	/**
	 * ����
	 * 
	 * @param id
	 * @return
	 */
	public Card loadCard(Integer id);

}
