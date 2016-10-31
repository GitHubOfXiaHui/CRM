<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Bootstrap -->
<link href="http://cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<title>会员详情</title>
<script type="text/javascript">
	$(function(){
		$("[data-target]").click(function(){
			var value = $(this).text();
			if(value == "展开"){
				$(this).text("隐藏");
			}
			else
			{
				$(this).text("展开");	
			}
		});
	});
</script>
</head>
<body>
	<div class="container" style="margin-top:20px;">
		<div class="panel-group">
			<div class="panel panel-success">
				<div class="panel-heading">会员详细信息</div>
				<div class="panel-body">
					<!-- 把详细信息分为两列 -->
					<div class="row">
						<div class="col-md-6">
							 <ul class="list-group">
								 <li class="list-group-item"><strong>中文姓名：</strong><s:property value="client.clientName" /></li>
								 <li class="list-group-item"><strong>英文姓名:</strong><s:property value="client.clientEnglishName" /></li>
								 <li class="list-group-item"><strong>手机号:</strong><s:property value="client.mobilePhoneNumber" /></li>
								 <li class="list-group-item"><strong>单位：</strong><s:property value="client.company" /></li>
								 <li class="list-group-item"><strong>职称：</strong><s:property value="client.title" /></li>
								 <li class="list-group-item"><strong>地址：</strong><s:property value="client.address" /></li>
								 <li class="list-group-item"><strong>身份证号：</strong><s:property value="client.IDNumber" /></li>
							 </ul>
						</div>
						<div class="col-md-6">
							<ul class="list-group">
								<li class="list-group-item"><strong>护照号：</strong><s:property value="client.passportNumber" /></li>
								<li class="list-group-item"><strong>护照有效期：</strong><s:property value="client.passportValidTime" /></li>
								<li class="list-group-item"><strong>通行证号：</strong><s:property value="client.accessNumber" /></li>
								<li class="list-group-item"><strong>通行证有效期：</strong><s:property value="client.accessValidTime" /></li>
								<li class="list-group-item"><strong>座位喜好：</strong><s:property value="client.preferSeat" /></li>
								<li class="list-group-item"><strong>推荐来源：</strong><s:property value="client.recommend" /></li>
								<li class="list-group-item"><strong>特别喜好：</strong><s:property value="client.like" /></li>
								<li class="list-group-item">
									<strong>常旅客列表：</strong>
									<button data-toggle="collapse" data-target="#frequentFlyers" class="btn btn-default btn-sm" >展开</button>
								</li>
								<div id="frequentFlyers" class="collapse">
									<s:iterator value="client.frequentFlyers" >
										<li class="list-group-item"><s:property /></li>
									</s:iterator>
								</div>
							</ul>
						</div>
					</div>
				</div>
			</div>
			
			<div class="panel panel-success">
				<div class="panel-heading">会员详细信息</div>
				<div class="panel-body">
					<table class="table table-hover table-bordered">
						<thead>
							<tr>
								<th>中文姓名</th>
								<th>英文姓名</th>
								<th>手机号</th>
								<th>单位</th>
								<th>职称</th>
								<th>地址</th>
								<th>身份证号</th>
								<th>护照号</th>
								<th>护照有效期</th>
								<th>通行证号</th>
								<th>通行证有效期</th>
								<th>座位喜好</th>
								<th>推荐来源</th>
								<th>特别喜好</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td><s:property value="client.clientName" /></td>
								<td><s:property value="client.clientEnglishName" /></td>
								<td><s:property value="client.mobilePhoneNumber" /></td>
								<td><s:property value="client.company" /></td>
								<td><s:property value="client.title" /></td>
								<td><s:property value="client.address" /></td>
								<td><s:property value="client.IDNumber" /></td>
								<td><s:property value="client.passportNumber" /></td>
								<td><s:property value="client.passportValidTime" /></td>
								<td><s:property value="client.accessNumber" /></td>
								<td><s:property value="client.accessValidTime" /></td>
								<td><s:property value="client.preferSeat" /></td>
								<td><s:property value="client.recommend" /></td>
								<td><s:property value="client.like" /></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			
			<div class="panel panel-success">
				<div class="panel-heading">会员卡列表</div>
				<div class="panel-body">
					<table class="table table-hover table-bordered">
						<thead>
							<tr>
								<th>会员卡号</th>
								<th>会员卡余额</th>
								<th>会员卡状态</th>
							</tr>
						</thead>
						<tbody>
						</tbody>
					</table>
				</div>
			</div>
			
			<div class="panel panel-success">
				<div class="panel-heading">会员消费记录</div>
				<div class="panel-body">
					<table class="table table-hover table-bordered">
						<thead>
							<tr>
								<th>航班号</th>
								<th>航班起点</th>
								<th>航班终点</th>
								<th>航班日期</th>
								<th>订票日期</th>
								<th>消费金额</th>
							</tr>
						</thead>
						<tbody>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>