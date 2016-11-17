package com.airwxtx.authority.entity;

public interface AuthorityNumber {
	// 录入会员信息
	public static final long SAVE_CLIENT = 1L;
	// 修改会员信息
	public static final long UPDATE_CLIENT = 1L << 1;
	// 导出会员信息
	public static final long EXPORT_CLIENT = 1L << 2;
	
	// 录入会员卡
	public static final long SELL_CARD = 1L << 3;
	// 充值
	public static final long CHARGE = 1L << 4;
	// 扣款
	public static final long PAY = 1L << 5;
	// 冻结会员卡
	public static final long FREEZE_CARD_UNLIMITED = 1L << 6;
	// 冻结会员卡每天2次
	public static final long FREEZE_CARD_LIMITED = 1L << 7;
	// 解冻会员卡
	public static final long UNFREEZE_CARD = 1L << 8;
	
	// 删除消费记录
	public static final long DELETE_RECORD_UNLIMITED = 1L << 9;
	// 10分钟内删除消费记录
	public static final long DELETE_RECORD_LIMITED = 1L << 10;
	// 导出消费记录
	public static final long EXPORT_RECORD = 1L << 11;
	
	// 管理系统用户
	public static final long CONTROL_USER = 1L << 12;
		
}
