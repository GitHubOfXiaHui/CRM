<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
#wrapper {
	position: fixed;
	top: 20%;
	left: 50%;
	transform: translateX(-50%);
}

img {
	float: left;
}

p {
	margin-top: 10px;
	margin-left: 64px;
	font-family: monospace;
	font-size: 20px;
	font-weight: bold;
}
</style>
<title>错误</title>
</head>
<body>
	<div id="wrapper">
		<img src="/CRM/images/errorPage.png" alt="error">
		<p>
			出错了，点击这里<a href="/CRM/home/homeAction">返回首页</a>
		</p>
	</div>
</body>
</html>