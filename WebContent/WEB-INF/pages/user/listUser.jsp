<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="container text-center">
	<form class="form-inline" action="/CRM/user/searchUserAction" method="post"
		 style="padding-top:10px;padding-bottom:10px;">
		<div class="form-group">
			<label for="username">用户名：</label>
			<input class="form-control" id="username" type="text" value="<s:property value='username' />">
			<input class="param" name="username" type="hidden" data-target="#username">
		</div>
		<div class="form-group">
			<label for="username">角色：</label>
			<select class="form-control" id="role">
				<s:iterator value="roles">
					<option value="<s:property />"><s:property /></option>
				</s:iterator>
			</select>
			<input class="param" name="role" type="hidden" data-target="#role">
		</div>
		<button class="btn btn-primary" type="submit">
			<span class="glyphicon glyphicon-search"></span> 搜索
		</button>
		<a class="btn btn-success" href="#" target="_blank">
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
						<a href="#" target="_blank">修改</a>
						&nbsp;/&nbsp;<a href="#" target="_blank">重置密码</a>
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
		// 拦截搜索动作
		$(function(){
			$("form").submit(function(){
				$(".param").each(function(){
					$(this).val($($(this).attr("data-target")).val());
				});
				var url = $(this).attr("action");
				var params = $(this).serialize();
				load(url, params);
				
				// 阻止表单默认提交
				return false;
			});
		});
	</script>
</div>