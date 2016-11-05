<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%-- 从Application中取到用户权限 --%>
<s:set var="userAuthority" value="#application.authority.get(#session.user)" />

<div class="container text-center">
	<form role="form" class="form-inline" action="/CRM/client/searchClientAction" method="post"
		style="padding-top:10px;padding-bottom:10px;">
		
		<div class="form-group">
			<label for="company">单位：</label>
			<input type="text" class="form-control" id="company" value="<s:property value='company' />">
		</div>
		
		<div class="form-group">
			<label for="name">姓名：</label>
			<input type="text" class="form-control" id="name" value="<s:property value='name' />">
		</div>
		
		<div class="form-group">
			<label for="cardNo">卡号：</label>
			<input type="text" class="form-control" id="cardNo" value="<s:property value='cardNo' />">
		</div>
		
		<div class="form-group">
			<label for="phone">手机号：</label>
			<input type="text" class="form-control" id="phone" value="<s:property value='phone' />">
		</div>
		
		<div style="padding-top:10px;">
			<button type="submit" class="btn btn-primary">
				<span class="glyphicon glyphicon-search"></span> 搜索
			</button>
			<s:if test="@com.airwxtx.authority.entity.AuthorityNumber@SAVE_CLIENT in #userAuthority">
				<a class="btn btn-success" href="/CRM/client/preSaveClientAction" target="_blank">
					<span class="glyphicon glyphicon-plus"></span> 添加
				</a>
			</s:if>
			<s:if test="@com.airwxtx.authority.entity.AuthorityNumber@EXPORT_CLIENT in #userAuthority">
				<a class="btn btn-info" href="/CRM/client/exportClientAction" target="_blank">
					<span class="glyphicon glyphicon-download"></span> 导出
				</a>
			</s:if>
		</div>
	</form>
			
	<table class="table table-hover table-bordered">
		<thead>
			<tr>
				<th class="text-center">#</th>
				<th class="text-center">单位</th>
				<th class="text-center">中文名</th>
				<th class="text-center">英文名</th>
				<th class="text-center">手机号</th>
				<th class="text-center">身份证</th>
				<th class="text-center">操作</th>
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
					<a href="/CRM/client/showClientDetailsAction?client.clientId=<s:property value='clientId' />" target="_blank">详情</a>
					<s:if test="@com.airwxtx.authority.entity.AuthorityNumber@UPDATE_CLIENT in #userAuthority">
						&nbsp;/&nbsp;<a href="/CRM/client/preUpdateClientAction?client.clientId=<s:property value='clientId' />" target="_blank">修改</a>
					</s:if>
					<s:if test="@com.airwxtx.authority.entity.AuthorityNumber@SELL_CARD in #userAuthority">
						&nbsp;/&nbsp;<a href="/CRM/client/preAddCardAction?client.clientId=<s:property value='clientId' />" target="_blank">添加会员卡</a>
					</s:if>
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
				name: $("#name").val(),
				phone: $("#phone").val(),
				company: $("#company").val(),
				cardNo: $("#cardNo").val()
			};
			onsearch(url, params);
					
			// 阻止表单默认提交
			return false;
		});
	});
	</script>
</div>	
