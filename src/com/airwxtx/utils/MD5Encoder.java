package com.airwxtx.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

public class MD5Encoder {

	/**
	 * �������ַ�������MD5����
	 * @param str
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 */
	public static String encode(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		// �޷����ܵ�ֱ�ӷ���
		if(null == str || str.equals("")){
			return str;
		}
		// ȷ�����㷽��
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		BASE64Encoder base64en = new BASE64Encoder();
		// ���ؼ��ܺ���ַ���
		return base64en.encode(md5.digest(str.getBytes("UTF-8")));
	}
}
