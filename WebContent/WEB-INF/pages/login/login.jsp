<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
<title>登录</title>
<meta charset="utf-8">

<!-- Bootstrap样式 -->
<link rel="stylesheet" href="/CRM/css/bootstrap.min.css">
<script src="/CRM/js/jquery.min.js" type="text/javascript"></script>
<script src="/CRM/js/bootstrap.min.js" type="text/javascript"></script>

<link rel="stylesheet" href="/CRM/css/logo.left.css">

<!-- 对密码进行md5加密，依赖jQuery -->
<script src="/CRM/js/jQuery.md5.js" type="text/javascript"></script>
<script src="/CRM/js/encryptPassword.js" type="text/javascript"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<script src="/CRM/js/html5shiv.min.js" type="text/javascript"></script>
<script src="/CRM/js/respond.min.js" type="text/javascript"></script>

<s:head />
</head>
<body>
	<img class="img-responsive" src="/CRM/images/logo.png" alt="logo"
		width="394px" height="75px">
	<hr>
	<div class="panel panel-info">
		<div class="panel-heading">登录</div>
		<div class="panel-body">
			<form action="/CRM/login/loginAction" method="post">
				<s:fielderror />
				<div class="form-group">
					<label for="username">用户名：</label> <input class="form-control"
						id="username" name="user.username" type="text"
						placeholder="Enter username"
						value="<s:property value='user.username'/>">
				</div>
				<div class="form-group">
					<label for="password">密码：</label> <input class="form-control"
						id="password" name="user.password" type="password"
						placeholder="Enter password">
				</div>
				<input class="btn btn-success btn-block" type="submit" value="登录">
			</form>
		</div>
	</div>
</body>
</html>
