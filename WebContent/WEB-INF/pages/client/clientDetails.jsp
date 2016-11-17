<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
<title>会员详情</title>
<meta charset="UTF-8">

<!-- Bootstrap样式 -->
<link rel="stylesheet" href="/CRM/css/bootstrap.min.css">
<script src="/CRM/js/jquery.min.js" type="text/javascript"></script>
<script src="/CRM/js/bootstrap.min.js" type="text/javascript"></script>
<!-- 微调Bootstrap样式 -->
<style type="text/css">
body {
	font-size: 16px;
}

.container {
	padding-top: 20px;
}

.row {
	margin-bottom: 10px;
}
</style>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<script src="/CRM/js/html5shiv.min.js" type="text/javascript"></script>
<script src="/CRM/js/respond.min.js" type="text/javascript"></script>

</head>
<body>
	<div class="container">
		<div class="panel-group">
			<div class="panel panel-info">
				<div class="panel-heading">会员信息</div>
				<div class="panel-body">
					<div class="row">
						<label class="col-md-2"><strong>单位：</strong></label>
						<div class="col-md-4"><s:property value="client.company" /></div>
						<label class="col-md-2"><strong>职位：</strong></label>
						<div class="col-md-4"><s:property value="client.title" /></div>
					</div>
					
					<div class="row">
						<label class="col-md-2"><strong>中文名：</strong></label>
						<div class="col-md-4"><s:property value="client.clientName" /></div>
						<label class="col-md-2"><strong>英文名：</strong></label>
						<div class="col-md-4"><s:property value="client.clientEnglishName" /></div>
					</div>
					
					<div class="row">
						<label class="col-md-2"><strong>手机号：</strong></label>
						<div class="col-md-4"><s:property value="client.mobilePhoneNumber" /></div>
						<label class="col-md-2"><strong>身份证：</strong></label>
						<div class="col-md-4"><s:property value="client.idNumber" /></div>
					</div>
					
					<div class="row">
						<label class="col-md-2"><strong>护照：</strong></label>
						<div class="col-md-4"><s:property value="client.passportNumber" /></div>
						<label class="col-md-2"><strong>护照有效期：</strong></label>
						<div class="col-md-4"><s:date name="client.passportValidTime" format="yyyy-MM-dd" /></div>
					</div>
					
					<div class="row">
						<label class="col-md-2"><strong>通行证：</strong></label>
						<div class="col-md-4"><s:property value="client.accessNumber" /></div>
						<label class="col-md-2"><strong>通行证有效期：</strong></label>
						<div class="col-md-4"><s:date name="client.accessValidTime" format="yyyy-MM-dd" /></div>
					</div>
										
					<div class="row">
						<label class="col-md-2"><strong>地址：</strong></label>
						<div class="col-md-10"><s:property value="client.address" /></div>
					</div>
					
					<div class="row">
						<label class="col-md-2"><strong>推荐客户来源：</strong></label>
						<div class="col-md-10"><s:property value="client.recommend" /></div>
					</div>
					
					<div class="row">
						<label class="col-md-2"><strong>座位喜好：</strong></label>
						<div class="col-md-10"><s:property value="client.preferSeat" /></div>
					</div>
					
					<div class="row">
						<label class="col-md-2"><strong>特别喜好：</strong></label>
						<div class="col-md-10"><s:property value="client.like" /></div>
					</div>
					
					<div class="row">
						<label class="col-md-2"><strong>常旅客：</strong></label>
						<div class="col-md-10">
							<s:iterator value="client.frequentFlyers" status="st">
								<s:if test="#st.first">
									<s:property />
								</s:if>
								<s:else>
									, <s:property />
								</s:else>
							</s:iterator>
						</div>
					</div>
					
					<div class="row">
						<label class="col-md-2"><strong>备注：</strong></label>
						<div class="col-md-10"><s:property value="client.comment" /></div>
					</div>
				</div>
			</div>
			
			<div class="panel panel-info">
				<div class="panel-heading">会员卡信息</div>
				<div class="panel-body">
					<table class="table table-hover table-bordered text-center">
						<thead>
							<tr>
								<th class="text-center">#</th>
								<th class="text-center">卡号</th>
								<th class="text-center">卡校验码</th>
								<th class="text-center">卡状态</th>
								<th class="text-center">余额（元）</th>
							</tr>
						</thead>
						<tbody>
							<s:iterator value="client.cards" status="st">
								<tr>
									<td><s:property value="#st.index + 1" /></td>
									<td><s:property value="cardNo" /></td>
									<td><s:property value="checkCode" /></td>
									<td><s:property value="status" /></td>
									<td>
										<s:text name="global.format.money">
											<s:param value="balance" />
										</s:text>
									</td>
								</tr>
							</s:iterator>
						</tbody>
					</table>
				</div>
			</div>
			
			<div class="panel panel-info">
				<div class="panel-heading">消费记录</div>
				<div class="panel-body">
					<table class="table table-hover table-bordered text-center">
						<thead>
							<tr>
								<th class="text-center">#</th>
								<th class="text-center">航班号</th>
								<th class="text-center">行程</th>
								<th class="text-center">航班日期</th>
								<th class="text-center">订票日期</th>
								<th class="text-center">消费金额</th>
								<th class="text-center">操作员</th>
								<th class="text-center">备注</th>
							</tr>
						</thead>
						<tbody>
							<s:set var="index" value="1" />
							<s:iterator value="client.cards">
								<s:iterator value="recodes">
									<tr>
										<td><s:property value="#index" /></td>
										<td><s:property value="fltNo" /></td>
										<td><s:property value="route" /></td>
										<td><s:date name="flightDate" format="yyyy-MM-dd" /></td>
										<td><s:date name="bookingDate" format="yyyy-MM-dd" /></td>
										<td>
											<s:text name="global.format.money">
												<s:param value="consumption" />
											</s:text>
										</td>
										<td><s:property value="user.username" /></td>
										<td><s:property value="comment" /></td>
									</tr>
									<s:set var="index" value="#index + 1" />
								</s:iterator>
							</s:iterator>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>