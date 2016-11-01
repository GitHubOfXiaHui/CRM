package com.airwxtx.authority.entity;

public interface AuthorityNumber {
	// 录入会员信息
	public static final long SAVE_CLIENT = 1l;
	// 查询会员信息
	public static final long SHOW_CLIENT = 1l << 1;
	// 修改会员信息
	public static final long UPDATE_CLIENT = 1l << 2;
	// 导出会员信息
	public static final long EXPORT_CLIENT = 1l << 3;
	
	// 录入会员卡
	public static final long SELL_CARD = 1l << 4;
	// 充值
	public static final long CHARGE = 1l << 5;
	// 扣款
	public static final long PAY = 1l << 6;
	// 冻结会员卡无限制
	public static final long FREEZE_CARD_UNLIMITED = 1l << 7;
	// 冻结会员卡每天2次
	public static final long FREEZE_CARD_LIMITED = 1l << 8;
	// 解冻会员卡
	public static final long UNFREEZE_CARD = 1l << 9;
	
	// 查询消费记录
	public static final long SHOW_RECORD = 1l << 10;
	// 删除消费记录
	public static final long DELETE_RECORD = 1l << 11;
	// 导出消费记录
	public static final long EXPORT_RECORD = 1l << 12;
	
	// 管理系统用户
	public static final long CONTROL_USER = 1l << 13;
		
	// 汇总后台资金
	public static final long MONEY_SUMMARY = 1l << 14;
}
