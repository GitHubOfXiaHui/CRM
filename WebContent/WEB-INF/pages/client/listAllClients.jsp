<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="container" style="margin-top:20px;">
	<div class="panel panel-success">
		<div class="panel-heading">搜索</div>
		<div class="panel-body">
			<div class="alert alert-success">
			    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			  	 <strong>提示：</strong> 默认显示所有会员。搜索时可单独按姓名或单位搜索，也可以二者都搜。
		 	</div>
			<form role="form" class="form-inline">
				<div class="form-group">
					<label for="name">姓名:</label>
					<input type="text" class="form-control" id="name" placeholder="请输入姓名">
				</div>
				<div class="form-group">
					<label for="company">单位:</label>
					<input type="text" class="form-control" id="company" placeholder="请输入单位">
				</div>
				<div class="form-group">
					<label for="card">卡号:</label>
					<input type="text" class="form-control" id="card" placeholder="请输入卡号">
				</div>
				<div class="form-group">
					<label for="phone">手机号:</label>
					<input type="text" class="form-control" id="phone" placeholder="请输入手机号">
				</div>
					<button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-search"></span>搜索</button>
					<a href="/CRM/client/preSaveClientAction" target="_blank" type="button" class="btn btn-success"><span class="glyphicon glyphicon-plus"></span>添加</a>
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
							<th>姓名</th>
							<th>手机号</th>
							<th>身份证号</th>
							<th>操作</th>
						</tr>
				</thead>
				<tbody>
					<s:iterator value="clients" status="i">
					<tr>
						<td><s:property value="#i.index" /></td>
						<td><s:property value="company" /></td>
						<td><s:property value="clientName" /></td>
						<td><s:property value="mobilePhoneNumber" /></td>
						<td><s:property value="idNumber" /></td>
						<td>
							<a class="btn btn-success" href="/CRM/client/showClientDetailsAction?clientId=<s:property value='clientId' />" target="_blank">查看</a>
							/
							<a class="btn btn-success" href="/CRM/client/preUpateClientAction?clientId=<s:property value='clientId' />" target="_blank">修改</a>
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
</div>	
