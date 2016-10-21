package com.airwxtx.authority.entity;

public interface AuthorityNumber {
	//��Ա����¼��
	public static final long SAVE_CLIENT = 1l;
	//��Ա������ȡ
	public static final long SHOW_CLIENT_DETAILS = 1l << 1;
	//��Ա�����޸�
	public static final long UPDATE_CLIENT = 1l << 2;
	//��ֵ
	public static final long CHARGE = 1l << 3;
	//�ۿ�
	public static final long PAY = 1l << 4;
	//�����Ա��
	public static final long FREEZE_CARD = 1l << 5;
	//�ⶳ��Ա��
	public static final long UNFREEZE_CARD = 1l << 6;
	//ɾ�����Ѽ�¼
	public static final long DELETE_RECORD = 1l << 7;
	//��̨�ʽ����
	public static final long MONEY_SUMMARY = 1l << 8;
}
