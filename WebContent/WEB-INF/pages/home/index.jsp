<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script type="text/javascript" src="../js/jquery-3.1.1.js"></script>
<script type="text/javascript">
	// 点击设置按钮显示/隐藏设置菜单
	$(function() {
		$("#settings").click(function() {
			$(this).next().toggleClass("hidden");
		});
	});

	// 高亮显示鼠标悬停的设置菜单
	$(function() {
		var $li = $("#header li");
		$li.hover(function() {
			$(this).addClass("highlight");
		}, function() {
			$(this).removeClass("highlight");
		});
	});
</script>

<link href="../css/index.css" rel="stylesheet" type="text/css">
<link href="../css/index-header.css" rel="stylesheet" type="text/css">
<link href="../css/index-main.css" rel="stylesheet" type="text/css">
<link href="../css/index-footer.css" rel="stylesheet" type="text/css">

<title>主页</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<div>AIRWXTX</div>
			<div>
				<button id="settings">设置</button>
				<ul class="hidden">
					<li><a href="../settings/profileAction">个人信息</a></li>
					<li><a href="../settings/changePasswordAction">修改密码</a></li>
					<li><a href="../settings/exitAction">安全退出</a></li>
				</ul>
			</div>
		</div>
		<div id="main"></div>
		<div id="footer">
			&copy;2016&nbsp;<a href="http://www.airwxtx.com">airwxtx</a>
		</div>
	</div>
</body>
</html>