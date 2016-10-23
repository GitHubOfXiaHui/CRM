<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- jQuery分页插件 -->
<link href="/CRM/css/jqpagination.css" rel="stylesheet" type="text/css">

<link href="/CRM/css/index.css" rel="stylesheet" type="text/css">
<link href="/CRM/css/index-header.css" rel="stylesheet" type="text/css">
<link href="/CRM/css/index-main.css" rel="stylesheet" type="text/css">
<link href="/CRM/css/index-footer.css" rel="stylesheet" type="text/css">

<script src="/CRM/js/jquery-3.1.1.min.js" type="text/javascript"></script>
<!-- jQuery分页插件 -->
<script src="/CRM/js/jquery.jqpagination.min.js" type="text/javascript"></script>
<script type="text/javascript">
	$(function() {
		// 点击设置显示/隐藏设置菜单
		$("#settings").click(function() {
			$("#nav-second").toggleClass("hidden");
			return false;
		});
		// 点击其他位置隐藏设置菜单
		$("body").click(function() {
			$("#nav-second").addClass("hidden");
		});
	});
	
	$(function(){
		$("#nav-first a").each(function(){
			var url = $(this).attr("href");
			$(this).click(function(){
				$("#main").load(url, {page: "1"}, function(){
					$(".pagination").jqPagination({
						page_string: "第 {current_page} / {max_page} 页",
						paged: function(page) {
					        // do something with the page variable
					        $("table").load(url + " table", {page: page});
					    }
					});
				});
				
				$(this).addClass("selected")	// 给当前元素添加selected属性
					   .parent().siblings().children("a").removeClass("selected");	// 去掉其他a标签的selected属性
				return false;
			});
		});
	});
</script>

<title>主页</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<div>AIRWXTX</div>
			<div>
				<ul id="nav-first">
					<li><a href="#">会员管理</a></li>
					<li><a href="#">会员卡管理</a></li>
					<li><a href="#">消费记录</a></li>
					<li><a href="/CRM/user/listUserAction">用户管理</a></li>
				</ul>
			</div>
			<div>
				<button id="settings">设置</button>
				<ul id="nav-second" class="hidden">
					<li><a href="/CRM/settings/profileAction">个人信息</a></li>
					<li><a href="/CRM/settings/preChangePasswordAction"
						target="_blank">修改密码</a></li>
					<li><a href="/CRM/settings/exitAction">安全退出</a></li>
				</ul>
			</div>
		</div>
		<div id="main"></div>
		<div id="footer">
			Copyright &copy; 2016&nbsp;<a href="http://www.airwxtx.com">airwxtx</a>
		</div>
	</div>
</body>
</html>