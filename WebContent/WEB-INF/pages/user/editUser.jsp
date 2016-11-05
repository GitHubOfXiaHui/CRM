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

<style type="text/css">
.container {
	padding-top: 20px;
	padding-right: 20%;
	padding-left: 20%;
}
</style>

<script type="text/javascript">
	// 全选框控制所有权限的选择
	$(function(){
		$("#selectAll").change(function(){
			var isChecked = $(this).prop("checked");
			$("[type='checkbox']").each(function(){
				$(this).prop("checked", isChecked);
			});
		});
	});
</script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<script src="/CRM/js/html5shiv.min.js" type="text/javascript"></script>
<script src="/CRM/js/respond.min.js" type="text/javascript"></script>

<s:head />
</head>
<body>
	<div class="container">
		<div class="panel panel-info">
			<div class="panel-heading">编辑用户</div>
			<div class="panel-body">
				<form class="form-horizontal" action="/CRM/user/editUserAction"
					method="post">
					<s:fielderror />
					<div class="form-group">
						<label class="control-label col-md-2" for="username">用户名：</label>
						<div class="col-md-5">
							<input name="user.username" type="hidden" value="<s:property value='user.username' />">
							<p class="form-control-static"><s:property value="user.username" /></p>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-2" for="role">角色：</label>
						<div class="col-md-4">
							<select class="form-control" id="role" name="user.role">
								<s:iterator value="allRoles" var="role">
									<option value="<s:property value='#role' />" <s:if test="user.role == #role">selected</s:if>><s:property value="#role" /></option>
								</s:iterator>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-2">权限：</label>
						<div class="checkbox col-md-5">
							<label><input id="selectAll" type="checkbox">全选</label>
						</div>
						<s:iterator value="allAuthorities" status="st">
							<div class="checkbox <s:if test="#st.odd">col-md-offset-2</s:if> col-md-5">
								<label><input name="authorityNumbers" type="checkbox"
									value="<s:property value='authorityNumber' />" 
									<s:if test="authorityNumber in authorityNumbers">checked</s:if>> 
									<s:property value="description" />
								</label>
							</div>
						</s:iterator>
					</div>
					<div class="form-group">
						<div class="col-md-offset-2 col-md-5">
							<input class="btn btn-success" type="submit" value="确定"
								style="width: 100px;">
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
