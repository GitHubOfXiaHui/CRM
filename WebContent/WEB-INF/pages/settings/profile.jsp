<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
<title>用户信息</title>
<meta charset="utf-8">

<!-- Bootstrap样式 -->
<link rel="stylesheet" href="/CRM/css/bootstrap.min.css">
<script src="/CRM/js/jquery.min.js" type="text/javascript"></script>
<script src="/CRM/js/bootstrap.min.js" type="text/javascript"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<script src="/CRM/js/html5shiv.min.js" type="text/javascript"></script>
<script src="/CRM/js/respond.min.js" type="text/javascript"></script>

<style type="text/css">
body {
	font-size: 16px;
}

.container {
	width: 700px;
	padding-top: 20px;
}

.row {
	margin-bottom: 10px;
}
</style>

</head>
<body>
	<div class="container">
		<div class="panel panel-info">
			<div class="panel-heading">用户信息</div>
			<div class="panel-body">
				<div class="row">
					<div class="col-md-2 text-right"><strong>用户名：</strong></div>
					<div class="col-md-5">
						<s:property value="user.username" />
					</div>
				</div>
				<div class="row">
					<div class="col-md-2 text-right"><strong>角色：</strong></div>
					<div class="col-md-5">
						<s:property value="user.role" />
					</div>
				</div>
				<div class="row">
					<s:iterator value="displayAuthorities" status="st">
						<s:if test="#st.first">
							<div class="col-md-2 text-right"><strong>权限：</strong></div>
							<div class="col-md-5">
								<s:property value="#st.index + 1" />. <s:property />
							</div>
						</s:if>
						<s:else>
							<div class="<s:if test="#st.odd">col-md-offset-2</s:if> col-md-5">
								<s:property value="#st.index + 1" />. <s:property />
							</div>
						</s:else>
					</s:iterator>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
