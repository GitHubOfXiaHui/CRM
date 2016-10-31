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
body {
	font-size: 16px;
}

.container {
	width: 800px;
	padding-top: 20px;
}

.row {
	margin-bottom: 10px;
}
</style>

</head>
<body>
	<div class="container">
		<div class="panel panel-info">
			<div class="panel-heading">消费记录详情</div>
			<div class="panel-body">
				<div class="row">
					<div class="col-md-2 text-right"><strong>航班号：</strong></div>
					<div class="col-md-4"><s:property value="recode.fltNo" /></div>
					<div class="col-md-2 text-right"><strong>消费金额：</strong></div>
					<div class="col-md-4"><s:property value="recode.consumption" /></div>
				</div>
				<div class="row">
					<div class="col-md-2 text-right"><strong>航程起点：</strong></div>
					<div class="col-md-4"><s:property value="recode.origin" /></div>
					<div class="col-md-2 text-right"><strong>航程终点：</strong></div>
					<div class="col-md-4"><s:property value="recode.destination" /></div>
				</div>
				<div class="row">
					<div class="col-md-2 text-right"><strong>航程日期：</strong></div>
					<div class="col-md-4"><s:property value="recode.flightDate" /></div>
					<div class="col-md-2 text-right"><strong>订票日期：</strong></div>
					<div class="col-md-4"><s:property value="recode.bookingDate" /></div>
				</div>
				<div class="row">
					<div class="col-md-2 text-right"><strong>备注：</strong></div>
					<div class="col-md-10"><s:property value="recode.comment" /></div>
				</div>
				<div class="row">
					<div class="col-md-2 text-right"><strong>会员中文名：</strong></div>
					<div class="col-md-4"><s:property value="recode.client.clientName" /></div>
					<div class="col-md-2 text-right"><strong>会员英文名：</strong></div>
					<div class="col-md-4"><s:property value="recode.client.clientEnglishName" /></div>
				</div>
				<div class="row">
					<div class="col-md-2 text-right"><strong>会员单位：</strong></div>
					<div class="col-md-4"><s:property value="recode.client.company" /></div>
					<div class="col-md-2 text-right"><strong>会员卡号：</strong></div>
					<div class="col-md-4"><s:property value="recode.card.cardNo" /></div>
				</div>
				<div class="row">
					<div class="col-md-2 text-right"><strong>操作员：</strong></div>
					<div class="col-md-4"><s:property value="recode.user.username" /></div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
