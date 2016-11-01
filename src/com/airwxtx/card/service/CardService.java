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

}
