<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div>
	<div>
		<form action="" method="POST">
			<label>用户名：</label><input name="username" type="text" value="<s:property value='username' />">
			<label>角色：</label>
			<select name="role">
				<s:iterator value="roles">
					<option value="<s:property />"><s:property /></option>
				</s:iterator>
			</select> <input type="submit" value="搜索">
		</form>
		<a href="#" target="_blank">添加</a>
	</div>
	<table>
		<tr>
			<th>#</th>
			<th>用户名</th>
			<th>角色</th>
			<th>操作</th>
		</tr>
		<s:iterator value="users" status="st">
			<tr>
				<td><s:property value="#st.index + 1" /></td>
				<td><s:property value="username" /></td>
				<td><s:property value="role" /></td>
				<td><a href="#" target="_blank">详情</a></td>
			</tr>
		</s:iterator>
	</table>
	<div class="pagination">
		<a href="#" class="first" data-action="first">&laquo;</a> 
		<a href="#" class="previous" data-action="previous">&lsaquo;</a>
		<input type="text" readonly="readonly" data-max-page="<s:property value='maxPage' />">
		<a href="#" class="next" data-action="next">&rsaquo;</a>
		<a href="#" class="last" data-action="last">&raquo;</a>
	</div>
</div>