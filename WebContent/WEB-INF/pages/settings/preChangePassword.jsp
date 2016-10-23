<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<s:head />
<link rel="stylesheet" href="/CRM/css/preChangePassword.css">
<link rel="stylesheet" href="/CRM/css/dialog.css">

<script src="/CRM/js/jquery-3.1.1.min.js" type="text/javascript"></script>
<script src="/CRM/js/jQuery.md5.js" type="text/javascript"></script>
<script src="/CRM/js/encryptPassword.js" type="text/javascript"></script>
<script src="/CRM/js/dialog.js" type="text/javascript"></script>
<script type="text/javascript">
	// ajax提交表单
	$(function() {
		$("form").submit(function() {
			$.post($(this).attr("action"), $(this).serialize(), function(data) {
				showMessageDialog(data.resultInfo, function(){
					$("input[type='password']").val("");
				});
			}, "json");

			// 阻止表单提交
			return false;
		});
	});
</script>

<title>修改密码</title>
</head>
<body>
	<div id="wrapper">
		<div class="title">修改密码</div>
		<form action="/CRM/settings/changePasswordAction" method="POST">
			<s:fielderror />
			<div>
				<label>原密码：</label><input name="oldPassword" type="password">
			</div>
			<div>
				<label>新密码：</label><input name="newPassword" type="password">
			</div>
			<div>
				<label>确认密码：</label><input name="confirmPassword" type="password">
			</div>
			<input type="submit" value="确定">
		</form>
	</div>
</body>
</html>