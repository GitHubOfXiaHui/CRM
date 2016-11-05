package com.airwxtx.authority.entity;

public interface AuthorityNumber {
	// ¼���Ա��Ϣ
	public static final long SAVE_CLIENT = 1l;
	// �޸Ļ�Ա��Ϣ
	public static final long UPDATE_CLIENT = 1l << 1;
	// ������Ա��Ϣ
	public static final long EXPORT_CLIENT = 1l << 2;
	
	// ¼���Ա��
	public static final long SELL_CARD = 1l << 3;
	// ��ֵ
	public static final long CHARGE = 1l << 4;
	// �ۿ�
	public static final long PAY = 1l << 5;
	// �����Ա��������
	public static final long FREEZE_CARD_UNLIMITED = 1l << 6;
	// �����Ա��ÿ��2��
	public static final long FREEZE_CARD_LIMITED = 1l << 7;
	// �ⶳ��Ա��
	public static final long UNFREEZE_CARD = 1l << 8;
	
	// ɾ�����Ѽ�¼
	public static final long DELETE_RECORD = 1l << 9;
	// �������Ѽ�¼
	public static final long EXPORT_RECORD = 1l << 10;
	
	// ����ϵͳ�û�
	public static final long CONTROL_USER = 1l << 11;
		
	// ���ܺ�̨�ʽ�
	public static final long MONEY_SUMMARY = 1l << 12;
}
