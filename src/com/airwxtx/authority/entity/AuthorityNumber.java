package com.airwxtx.authority.entity;

public interface AuthorityNumber {
	//会员资料录入
	public static final long SAVE_CLIENT = 1l;
	//会员资料提取
	public static final long SHOW_CLIENT_DETAILS = 1l << 1;
	//会员资料修改
	public static final long UPDATE_CLIENT = 1l << 2;
	//充值
	public static final long CHARGE = 1l << 3;
	//扣款
	public static final long PAY = 1l << 4;
	//冻结会员卡
	public static final long FREEZE_CARD = 1l << 5;
	//解冻会员卡
	public static final long UNFREEZE_CARD = 1l << 6;
	//删除消费记录
	public static final long DELETE_RECORD = 1l << 7;
	//后台资金汇总
	public static final long MONEY_SUMMARY = 1l << 8;
}
