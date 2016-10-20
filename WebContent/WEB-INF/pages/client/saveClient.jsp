<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>创建新客户</title>


<!-- 导入struts样式 -->
<s:head />
</head>
<body>
	<div class="clientTable">
	<s:form id="clientForm" action="saveClientAction" method="post">
		<s:textfield name="client.clientName" label="会员姓名"/>
		<s:textfield name="client.clientEnglishName" label="会员英文姓名"/>
		<s:textfield name="client.mobilePhoneNumber" label="会员手机号"/>
		<s:textfield name="client.company" label="会员单位"/>
		<s:textfield name="client.title" label="会员职称"/>
		<s:textfield name="client.address" label="会员地址"/>
		<s:textfield name="client.IDNumber" label="会员身份证号"/>
		<s:textfield name="client.passportNumber" label="会员护照号"/>
		<s:textfield name="client.accessNumber" label="会员通行证号"/>
		<s:submit key="创建客户"/>
	</s:form>
	</div>
</body>
</html>