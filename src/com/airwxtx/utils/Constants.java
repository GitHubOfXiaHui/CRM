package com.airwxtx.utils;

import java.io.File;

public interface Constants {

	// 分页大小
	public static final int PAGE_SIZE = 10;

	// 冻结权限上限
	public static final int FREEZE_UPPER_LIMIT = 2;
	
	// 默认密码“123456”
	public static final String PASSWORD = "e10adc3949ba59abbe56e057f20f883e";
	
	// 下载根目录
	public static final String CLIENT_ROOT = File.pathSeparator + "CRM" + File.pathSeparator + "client";
	public static final String RECODE_ROOT = File.pathSeparator + "CRM" + File.pathSeparator + "recode";
	
}
