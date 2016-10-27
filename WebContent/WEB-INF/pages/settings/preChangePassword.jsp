<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="zh">
<head>
<title>修改密码</title>
<meta charset="utf-8">

<!-- Bootstrap样式 -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<style>
img {
	position: fixed;
	top: 50%;
	left: 25%;
	width: 394px;
	height: 75px;
	margin-top: -37px;
	margin-left: -197px;
}

hr {
	position: fixed;
	top: 50%;
	left: 50%;
	width: 2px;
	height: 300px;
	margin-top: -150px;
	margin-left: -1px;
	background-color: #9c6;
}

.panel {
	position: fixed;
	top: 50%;
	left: 75%;
	width: 300px;
	transform: translate(-150px, -50%);
}
</style>

<!-- 对密码进行md5加密，依赖jQuery -->
<script src="/CRM/js/jQuery.md5.js" type="text/javascript"></script>
<script src="/CRM/js/encryptPassword.js" type="text/javascript"></script>

<s:head />
</head>
<body>
	<s:if test="result == 'success'">
		<s:include value="/WEB-INF/pages/utils/success.jsp" />
	</s:if>
	<img class="img-responsive" src="/CRM/images/logo.png" alt="logo" width="394px"
		height="75px">
	<hr>
	<div class="panel panel-success">
		<div class="panel-heading">修改密码</div>
		<div class="panel-body">
			<form action="/CRM/settings/changePasswordAction" method="post">
				<s:fielderror />
				<div class="form-group">
					<label for="oldPassword">原密码：</label> <input class="form-control"
						id="oldPassword" name="oldPassword" type="password" value="<s:property value='oldPassword' />">
				</div>
				<div class="form-group">
					<label for="newPassword">新密码：</label> <input class="form-control"
						id="newPassword" name="newPassword" type="password" value="<s:property value='newPassword' />">
				</div>
				<div class="form-group">
					<label for="confirmPassword">确认密码：</label> <input
						class="form-control" id="confirmPassword" name="confirmPassword"
						type="password" value="<s:property value='confirmPassword' />">
				</div>
				<input class="btn btn-success btn-block" type="submit" value="确定">
			</form>
		</div>
	</div>
</body>
</html>
