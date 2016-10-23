<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<s:head />
<link rel="stylesheet" href="/CRM/css/login.css">

<script src="/CRM/js/jquery-3.1.1.min.js" type="text/javascript"></script>
<script src="/CRM/js/jQuery.md5.js" type="text/javascript"></script>
<script src="/CRM/js/encryptPassword.js" type="text/javascript"></script>

<title>登陆</title>
</head>
<body>
	<div id="wrapper">
		<div id="logo">AIRWXTX</div>
		<form action="/CRM/login/loginAction" method="POST">
			<s:fielderror />
			<div>
				<label>用户名：</label><input name="user.username" type="text"
					value="<s:property value='user.name'/>">
			</div>
			<div>
				<label>密码：</label><input name="user.password" type="password">
			</div>
			<input type="submit" value="登录">
		</form>
	</div>
</body>
</html>