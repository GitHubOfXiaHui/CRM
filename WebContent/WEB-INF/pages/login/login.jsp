<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<title>登录</title>
<meta charset="UTF-8">
<s:head />
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="/CRM/js/jQuery.md5.js" type="text/javascript"></script>
<script src="/CRM/js/encryptPassword.js" type="text/javascript"></script>
</head>
<body>
	<div class="container text-center"
		style="padding-top: 100px; padding-left: 20%; padding-right: 30%;">
		<h1>AIRWXTX</h1>
		<form class="form-horizontal" action="/CRM/login/loginAction"
			method="post">
			<s:fielderror />
			<div class="form-group">
				<label class="col-md-4 control-label" for="username">用户名：</label>
				<div class="col-md-8">
					<input class="form-control" id="username" name="user.username"
						type="text" placeholder="Enter username">
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label" for="password">密码：</label>
				<div class="col-md-8">
					<input class="form-control" id="password" name="user.password"
						type="password" placeholder="Enter password">
				</div>
			</div>
			<div class="form-group">
				<div class="col-md-offset-4 col-md-4">
					<input class="btn btn-success btn-block" type="submit" value="登录">
				</div>
			</div>
		</form>
	</div>
</body>
</html>
