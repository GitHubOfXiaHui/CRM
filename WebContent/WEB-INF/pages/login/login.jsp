<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script type="text/javascript" src="../js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="../js/jQuery.md5.js"></script>
<script type="text/javascript">
	//表单提交时对密码进行md5加密
	$(function() {
		$("#loginForm").submit(function() {
			var $password = $("input[type='password']");
			if($.trim($password.val()) != ""){
				$password.val($.md5($password.val()));
			}
		});
	});

	// 当鼠标移动到登录按钮上时，高亮显示
	$(function() {
		var $submit = $("input[type='submit']");
		$submit.hover(function() {
			$submit.addClass("highlight");
		}, function() {
			$submit.removeClass("highlight");
		});
	});
</script>

<link href="../css/login.css" rel="stylesheet" type="text/css">
<s:head />
<title>登陆</title>
</head>
<body>
	<div id="wrapper">
		<div id="logo">AIRWXTX</div>
		<form id="loginForm" action="loginAction" method="post">
			<s:fielderror />
			<div>
				<label>用户名：</label><input type="text" name="user.username"
					value=<s:property value="user.username" />>
			</div>
			<div>
				<label>密&nbsp;码：</label><input type="password" name="user.password">
			</div>
			<input type="submit" value="登录">
		</form>
	</div>
</body>
</html>