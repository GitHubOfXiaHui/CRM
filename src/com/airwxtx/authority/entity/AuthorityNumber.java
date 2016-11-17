package com.airwxtx.authority.entity;

public interface AuthorityNumber {
	// ¼���Ա��Ϣ
	public static final long SAVE_CLIENT = 1L;
	// �޸Ļ�Ա��Ϣ
	public static final long UPDATE_CLIENT = 1L << 1;
	// ������Ա��Ϣ
	public static final long EXPORT_CLIENT = 1L << 2;
	
	// ¼���Ա��
	public static final long SELL_CARD = 1L << 3;
	// ��ֵ
	public static final long CHARGE = 1L << 4;
	// �ۿ�
	public static final long PAY = 1L << 5;
	// �����Ա��
	public static final long FREEZE_CARD_UNLIMITED = 1L << 6;
	// �����Ա��ÿ��2��
	public static final long FREEZE_CARD_LIMITED = 1L << 7;
	// �ⶳ��Ա��
	public static final long UNFREEZE_CARD = 1L << 8;
	
	// ɾ�����Ѽ�¼
	public static final long DELETE_RECORD_UNLIMITED = 1L << 9;
	// 10������ɾ�����Ѽ�¼
	public static final long DELETE_RECORD_LIMITED = 1L << 10;
	// �������Ѽ�¼
	public static final long EXPORT_RECORD = 1L << 11;
	
	// ����ϵͳ�û�
	public static final long CONTROL_USER = 1L << 12;
		
}
