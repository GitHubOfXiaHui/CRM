<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>主页</title>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<style>
/* 微调Bootstrap样式 */
.navbar {
	margin-bottom: 0;
	font-size: 12px;
	background-color: #9c6;
	border: none;
	border-radius: 0;
}

.bg-footer {
	padding-top: 20px;
	color: white;
	background-color: #9c6;
}

/* 当页面内容少时页脚位于屏幕底部，内容多时位于内容下面 */
html, body {
	margin: 0;
	padding: 0;
	height: 100%;
}

#wrapper {
	position: relative;
	min-height: 100%;
}

#main {
	padding-bottom: 60px; /* Height of the footer */
}

footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px; /* Height of the footer */
}
</style>

<!-- jQuery分页插件 -->
<link href="/CRM/css/jqpagination.css" rel="stylesheet" type="text/css">
<script src="/CRM/js/jquery.jqpagination.min.js" type="text/javascript"></script>
<script type="text/javascript">
	// 加载第1页到#main，同时初始化分页插件
	function load(url, params) {
		params.page = 1;
		$("#main").load(url, params, function() {
			$(".pagination").jqPagination({
				page_string : "第 {current_page} / {max_page} 页",
				paged : function(page) {
					// do something with the page variable
					params.page = page;
					$("table").load(url + " thead,tbody", params);
				}
			});
		});
	}

	// 为导航按钮绑定点击事件
	$(function() {
		$("#nav a").each(function() {
			var url = $(this).attr("href");
			$(this).click(function() {
				load(url, {});

				$(this).parent("li").addClass("active") // 父li元素添加active属性
				.siblings("li").removeClass("active"); // 父li元素同级的li元素移除active属性
				
				// 阻止a标签的默认动作
				return false;
			});
		});
	});
</script>
</head>
<body>
	<div id="wrapper">
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="#">AIRWXTX</a>
				</div>
				<ul class="nav navbar-nav" id="nav">
					<li class="active"><a href="#">会员管理</a></li>
					<li><a href="#">会员卡管理</a></li>
					<li><a href="#">消费记录</a></li>
					<li><a href="/CRM/user/searchUserAction">用户管理</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">设置<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="/CRM/settings/profileAction">个人信息</a></li>
							<li><a href="/CRM/settings/preChangePasswordAction"
								target="_blank">修改密码</a></li>
							<li><a href="/CRM/settings/exitAction">安全退出</a></li>
						</ul>
					</li>
				</ul>
			</div>
		</nav>
		<div id="main"></div>
		<footer class="container-fluid bg-footer text-center">
			<p>
				Copyright &copy; 2016 <a href="http://www.airwxtx.com">airwxtx.com</a>
			</p>
		</footer>
	</div>
</body>
</html>
