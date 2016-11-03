<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%-- 从Application中取到用户权限 --%>
<s:set var="userAuthority" value="#application.authority.get(#session.user)" />

<div class="container" style="margin-top:20px;">
	<div class="panel panel-success">
		<div class="panel-heading">搜索</div>
		<div class="panel-body">
			<div class="alert alert-success">
			    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			  	 <strong>提示：</strong> 默认显示所有会员。搜索时可单独按姓名或单位搜索，也可以二者都搜。
		 	</div>
			<form role="form" class="form-inline" action="/CRM/client/searchClientAction" method="post">
				<div class="form-group">
					<label for="name">姓名:</label>
					<input type="text" class="form-control" id="name" value="<s:property value='name' />" placeholder="请输入姓名">
					<input class="param" name="name" type="hidden" data-target="#name" value="<s:property value='name' />">
				</div>
				<div class="form-group">
					<label for="company">单位:</label>
					<input type="text" class="form-control" id="company" value="<s:property value='company' />" placeholder="请输入单位">
					<input class="param" name="company" type="hidden" data-target="#company" value="<s:property value='company' />">
				</div>
				<div class="form-group">
					<label for="card">卡号:</label>
					<input type="text" class="form-control" id="card" value="<s:property value='card' />" placeholder="请输入卡号">
					<input class="param" name="card" type="hidden" data-target="#card" value="<s:property value='card' />">
				</div>
				<div class="form-group">
					<label for="phone">手机号:</label>
					<input type="text" class="form-control" id="phone" value="<s:property value='phone' />" placeholder="请输入手机号">
					<input class="param" name="phone" type="hidden" data-target="#phone" value="<s:property value='phone' />">
				</div>
					<button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-search"></span>搜索</button>
					<s:if test="@com.airwxtx.authority.entity.AuthorityNumber@SAVE_CLIENT in #userAuthority">
						<a href="/CRM/client/preSaveClientAction" target="_blank" type="button" class="btn btn-success"><span class="glyphicon glyphicon-plus"></span>添加</a>
					</s:if>
					<s:if test="@com.airwxtx.authority.entity.AuthorityNumber@EXPORT_CLIENT in #userAuthority">
						<a class="btn btn-info" href="/CRM/client/exportClientAction" target="_blank"><span class="glyphicon glyphicon-download"></span>导出</a>
					</s:if>
			</form>
		</div>
	</div>
			
	<div class="panel panel-success">
		<div class="panel-heading">会员列表</div>
		<div class="panel-body">
			<table class="table table-hover table-bordered">
				<thead>
					<tr>
							<th>#</th>
							<th>单位</th>
							<th>中文姓名</th>
							<th>英文姓名</th>
							<th>手机号</th>
							<th>身份证号</th>
							<th>操作</th>
						</tr>
				</thead>
				<tbody>
					<s:iterator value="clients" status="i">
					<tr>
						<td><s:property value="#i.index+1" /></td>
						<td><s:property value="company" /></td>
						<td><s:property value="clientName" /></td>
						<td><s:property value="clientEnglishName" /></td>
						<td><s:property value="mobilePhoneNumber" /></td>
						<td><s:property value="idNumber" /></td>
						<td>
							<a class="btn btn-success" href="/CRM/client/showClientDetailsAction?clientId=<s:property value='clientId' />" target="_blank">详情</a>
							<s:if test="@com.airwxtx.authority.entity.AuthorityNumber@UPDATE_CLIENT in #userAuthority">
								&nbsp;/&nbsp;<a class="btn btn-success" href="/CRM/client/preUpdateClientAction?clientId=<s:property value='clientId' />" target="_blank">修改</a>
							</s:if>
							<s:if test="@com.airwxtx.authority.entity.AuthorityNumber@SELL_CARD in #userAuthority">
								&nbsp;/&nbsp;<a class="btn btn-success" href="/CRM/client/preUpdateClientAction?clientId=<s:property value='clientId' />" target="_blank">添加会员卡</a>
							</s:if>
						</td>
					</tr>
					</s:iterator>
				</tbody>
			</table>
		</div>
	</div>
	
	<div class="pagination">
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
			$(".param").each(function(){
				//将查询参数保存在隐藏框
				$(this).val($($(this).attr("data-target")).val());
			});
			var url = $(this).attr("action");
			var params = {
				name: $("[data-target='#name']").val(),
				phone: $("[data-target='#phone']").val(),
				company: $("[data-target='#company']").val(),
				card: $("[data-target='#card']").val()
			};
			onsearch(url, params);
					
			// 阻止表单默认提交
			return false;
		});
	});
	</script>
</div>	
