package com.airwxtx.utils;

import java.util.ArrayList;
import java.util.List;

import com.airwxtx.authority.entity.Authority;
import com.airwxtx.authority.entity.AuthorityNumber;

public abstract class Constants {

	// ��ҳ��С
	public static final int PAGE_SIZE = 10;

	// ����Ȩ������
	public static final int FREEZE_UPPER_LIMIT = 2;
	
	// Ĭ�����롰123456��
	public static final String PASSWORD = "e10adc3949ba59abbe56e057f20f883e";
	
	public static final List<Authority> ALL_AUTHORITIES = new ArrayList<>();
	
	static {
		ALL_AUTHORITIES.add(new Authority(AuthorityNumber.SAVE_CLIENT, "¼���Ա��Ϣ"));
		ALL_AUTHORITIES.add(new Authority(AuthorityNumber.UPDATE_CLIENT, "�޸Ļ�Ա��Ϣ"));
		ALL_AUTHORITIES.add(new Authority(AuthorityNumber.EXPORT_CLIENT, "������Ա��Ϣ"));
		ALL_AUTHORITIES.add(new Authority(AuthorityNumber.SELL_CARD, "¼���Ա����Ϣ"));
		ALL_AUTHORITIES.add(new Authority(AuthorityNumber.CHARGE, "��ֵ"));
		ALL_AUTHORITIES.add(new Authority(AuthorityNumber.PAY, "�ۿ�"));
		ALL_AUTHORITIES.add(new Authority(AuthorityNumber.FREEZE_CARD_UNLIMITED, "�����Ա��������"));
		ALL_AUTHORITIES.add(new Authority(AuthorityNumber.FREEZE_CARD_LIMITED, "�����Ա��ÿ��2��"));
		ALL_AUTHORITIES.add(new Authority(AuthorityNumber.UNFREEZE_CARD, "�ⶳ��Ա��"));
		ALL_AUTHORITIES.add(new Authority(AuthorityNumber.DELETE_RECORD, "ɾ�����Ѽ�¼"));
		ALL_AUTHORITIES.add(new Authority(AuthorityNumber.EXPORT_RECORD, "�������Ѽ�¼"));
		ALL_AUTHORITIES.add(new Authority(AuthorityNumber.CONTROL_USER, "����ϵͳ�û�"));
		ALL_AUTHORITIES.add(new Authority(AuthorityNumber.MONEY_SUMMARY, "���ܺ�̨�ʽ�"));
	}
	
}
