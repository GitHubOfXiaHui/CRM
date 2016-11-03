package com.airwxtx.card.service;

import java.util.List;

import com.airwxtx.card.entity.Card;

public interface CardService {

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
	 * ���ػ�Ա��
	 * 
	 * @param id
	 * @return
	 */
	public Card loadCard(Integer id);

	/**
	 * ������Ա��
	 * 
	 * @param card
	 */
	public void saveCard(Card card);

	/**
	 * �޸Ļ�Ա��
	 * 
	 * @param card
	 */
	public void updateCard(Card card);

	/**
	 * �жϸ��û��Ƿ���ж���Ȩ��
	 * 
	 * @param username
	 * @return
	 */
	public boolean canFreezeCard(String username);

	/**
	 * �����Ա��
	 * 
	 * @param cardId
	 */
	public void freezeCard(Integer cardId);

	/**
	 * �ⶳ��Ա��
	 * 
	 * @param cardId
	 */
	public void unfreezeCard(Integer cardId);

}
