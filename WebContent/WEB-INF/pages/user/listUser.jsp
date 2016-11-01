<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="container text-center">
	<form class="form-inline" action="/CRM/user/searchUserAction" method="post"
		 style="padding-top:10px;padding-bottom:10px;">
		<div class="form-group">
			<label for="username">用户名：</label>
			<input class="form-control" name="username" type="text" value="<s:property value='username' />">
		</div>
		<div class="form-group">
			<label for="role">角色：</label>
			<select class="form-control" name="role">
				<option value="">请选择</option>
				<s:iterator value="allRoles" var="role">
					<option value="<s:property value='#role' />" <s:if test="role == #role">selected</s:if>><s:property value="#role" /></option>
				</s:iterator>
			</select>
		</div>
		<button class="btn btn-primary" type="submit">
			<span class="glyphicon glyphicon-search"></span> 搜索
		</button>
		<a class="btn btn-success" href="/CRM/user/preCreateUserAction" target="_blank">
			<span class="glyphicon glyphicon-plus"></span> 添加
		</a>
	</form>
	<table class="table table-bordered table-striped table-hover">
		<thead>
			<tr>
				<th class="text-center">#</th>
				<th class="text-center">用户名</th>
				<th class="text-center">角色</th>
				<th class="text-center">操作</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="users" status="st">
				<tr>
					<td><s:property value="#st.index + 1" /></td>
					<td><s:property value="username" /></td>
					<td><s:property value="role" /></td>
					<td>
						<a href="/CRM/user/preEditUserAction?user.username=<s:property value='username' />" target="_blank">编辑</a>
						&nbsp;/&nbsp;<a href="/CRM/user/resetPasswordAction?user.username=<s:property value='username' />" data-id="reset-password">重置密码</a>
					</td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
	<div class="pagination" style="margin-top:-10px;">
		<a href="#" class="first" data-action="first">&laquo;</a> 
		<a href="#" class="previous" data-action="previous">&lsaquo;</a>
		<input type="text" readonly="readonly" data-max-page="<s:property value='maxPage' />">
		<a href="#" class="next" data-action="next">&rsaquo;</a>
		<a href="#" class="last" data-action="last">&raquo;</a>
	</div>
	<script type="text/javascript">
		$(function(){
			// 拦截搜索动作
			$("form").submit(function(){
				var url = $(this).attr("action");
				var params = {
					username: $("[name='username']").val(),
					role: $("[name='role']").val()
				};
				onsearch(url, params);
						
				// 阻止表单默认提交
				return false;
			});
					
			// 拦截重置密码
			$("[data-id='reset-password']").each(function(){
				$(this).click(function(){
					$.getJSON($(this).attr("href"), function(data){
						bootbox.setDefaults({locale:"zh_CN"});
						bootbox.alert(data.resultInfo);
					});
							
					// 阻止默认提交
					return false;
				});
			});
		});
	</script>
</div>