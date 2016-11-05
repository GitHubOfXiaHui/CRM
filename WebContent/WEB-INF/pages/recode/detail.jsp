<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
<title>用户信息</title>
<meta charset="utf-8">

<!-- Bootstrap样式 -->
<link rel="stylesheet" href="/CRM/css/bootstrap.min.css">
<script src="/CRM/js/jquery.min.js" type="text/javascript"></script>
<script src="/CRM/js/bootstrap.min.js" type="text/javascript"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<script src="/CRM/js/html5shiv.min.js" type="text/javascript"></script>
<script src="/CRM/js/respond.min.js" type="text/javascript"></script>

<style type="text/css">
body {
	font-size: 16px;
}

.container {
	padding-top: 20px;
	padding-right: 20%;
	padding-left: 20%;
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
					<label class="col-md-3"><strong>航班号：</strong></label>
					<div class="col-md-9"><s:property value="recode.fltNo" /></div>
				</div>
				
				<div class="row">
					<label class="col-md-3"><strong>行程：</strong></label>
					<div class="col-md-9"><s:property value="recode.route" /></div>
				</div>
				
				<div class="row">
					<label class="col-md-3"><strong>航班日期：</strong></label>
					<div class="col-md-9">
						<s:date name="recode.flightDate" format="yyyy-MM-dd" />
					</div>
				</div>
				
				<div class="row">
					<label class="col-md-3"><strong>订票日期：</strong></label>
					<div class="col-md-9">
						<s:date name="recode.bookingDate" format="yyyy-MM-dd" />
					</div>
				</div>
				
				<div class="row">
					<label class="col-md-3"><strong>消费金额：</strong></label>
					<div class="col-md-9">
						<s:text name="global.format.money">
							<s:param value="recode.consumption" />
						</s:text>
					</div>				
				</div>
				
				<div class="row">
					<label class="col-md-3"><strong>备注：</strong></label>
					<div class="col-md-9"><s:property value="recode.comment" /></div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
