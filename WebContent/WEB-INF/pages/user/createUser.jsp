<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="zh">
<head>
<title>用户信息</title>
<meta charset="utf-8">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<style type="text/css">
.container {
	width: 800px;
	padding-top: 20px;
}
</style>

<script type="text/javascript">
	// 全选框控制所有权限的选择
	$(function() {
		$("#selectAll").change(function() {
			var isChecked = $(this).prop("checked");
			$("[type='checkbox']").each(function() {
				$(this).prop("checked", isChecked);
			});
		});
	});
</script>

<s:head />
</head>
<body>
	<div class="container">
		<div class="panel panel-info">
			<div class="panel-heading">创建用户</div>
			<div class="panel-body">
				<form class="form-horizontal" action="/CRM/user/createUserAction"
					method="post">
					<s:fielderror />
					<div class="form-group">
						<label class="control-label col-md-2" for="username">用户名：</label>
						<div class="col-md-5">
							<input class="form-control" id="username" name="user.username"
								type="text" placeholder="Enter username"
								value="<s:property value='user.username' />">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-2" for="role">角色：</label>
						<div class="col-md-3">
							<select class="form-control" id="role" name="user.role">
								<s:iterator value="allRoles">
									<option value="<s:property />"><s:property /></option>
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
							<div
								class="checkbox <s:if test="#st.odd">col-md-offset-2</s:if> col-md-5">
								<label>
									<input name="authorityNumbers" type="checkbox"
										value="<s:property value='authorityNumber' />"
										<s:if test="authorityNumbers.contains(authorityNumber)">checked</s:if>> 
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
