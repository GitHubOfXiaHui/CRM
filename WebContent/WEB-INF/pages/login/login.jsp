<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
</head>
<body>
	<div id="wrapper">
		<div id="logo">AIRWXTX</div>
		<form action="loginAction">
			<div>
				<div class="input-error"><s:if test="usernameError">用户名不存在</s:if></div>
				<label>用户名：</label><input type="text" name="user.username">
			</div>
			<div>
				<div class="input-error"><s:if test="passwordError">密码错误</s:if></div>
				<label>密    码：</label><input type="password" name="user.password">
			</div>
			<input type="submit" value="登陆">
		</form>
	</div>
</body>
</html>