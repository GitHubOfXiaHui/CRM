package com.airwxtx.card.service;

import java.util.List;

import com.airwxtx.card.entity.Card;
import com.airwxtx.recode.entity.Recode;

public interface CardService {

	/**
	 * �����ź�/��״̬��ҳ��ѯ��Ա��
	 * 
	 * @param cardNo
	 * @param status
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public List<Card> findCardByCardNoOrStatusWithPage(String cardNo, String status, int page, int pageSize);

	/**
	 * �����ź�/��״̬ͳ�ƻ�Ա������
	 * 
	 * @param cardNo
	 * @param status
	 * @return
	 */
	public int countCardWithCardNoOrStatus(String cardNo, String status);

	/**
	 * ���ػ�Ա��
	 * 
	 * @param id
	 * @return
	 */
	public Card loadCard(Integer cardId);

	/**
	 * ������Ա��
	 * 
	 * @param card
	 */
	public void saveCard(Card card);

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
	 * @param username
	 */
	public void freezeCard(Integer cardId, String username);

	/**
	 * �ⶳ��Ա��
	 * 
	 * @param cardId
	 */
	public void unfreezeCard(Integer cardId);

	/**
	 * ��ֵ
	 * 
	 * @param cardId
	 * @param money
	 */
	public void charge(Integer cardId, double money);

	/**
	 * �ۿ�
	 * 
	 * @param card
	 * @param recode
	 */
	public void pay(Card card, Recode recode);

}
