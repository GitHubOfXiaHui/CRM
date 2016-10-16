package com.airwxtx.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

public class MD5Encoder {

	/**
	 * 对输入字符串进行MD5加密
	 * @param str
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 */
	public static String encode(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		// 无法加密的直接返回
		if(null == str || str.equals("")){
			return str;
		}
		// 确定计算方法
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		BASE64Encoder base64en = new BASE64Encoder();
		// 返回加密后的字符串
		return base64en.encode(md5.digest(str.getBytes("UTF-8")));
	}
}
