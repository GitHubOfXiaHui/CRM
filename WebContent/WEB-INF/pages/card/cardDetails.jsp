<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>会员卡详情</title>

<!-- Bootstrap样式 -->
<link rel="stylesheet" href="/CRM/css/bootstrap.min.css">
<script src="/CRM/js/jquery.min.js" type="text/javascript"></script>
<script src="/CRM/js/bootstrap.min.js" type="text/javascript"></script>

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

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<script src="/CRM/js/html5shiv.min.js" type="text/javascript"></script>
<script src="/CRM/js/respond.min.js" type="text/javascript"></script>

</head>
<body>
	<div class="container">
		<div class="panel panel-info">
			<div class="panel-heading">会员卡详情</div>
			<div class="panel-body">
			  	
			  	<div class="row">
			    	<label class="col-sm-3"><strong>卡号：</strong></label>
				    <div class="col-sm-9"><s:property value="card.cardNo" /></div>
			  	</div>
			  				  	
			  	<div class="row">
				    <label class="col-sm-3"><strong>卡校验码：</strong></label>
				    <div class="col-sm-9"><s:property value="card.checkCode" /></div>
			  	</div>
			  				  	
			  	<div class="row">
			    	<label class="col-sm-3"><strong>手机号：</strong></label>
				    <div class="col-sm-9"><s:property value="card.phone" /></div>
			  	</div>
			  	
			  	<div class="row">
			  		<label class="col-sm-3"><strong>卡状态：</strong></label>
				    <div class="col-sm-9"><s:property value="card.status" /></div>
			  	</div>
			  	
			  	<div class="row">
			    	<label class="col-sm-3"><strong>余额：</strong></label>
				    <div class="col-sm-9">
				    	<s:text name="global.format.money">
							<s:param value="card.balance" />
						</s:text>
				    </div>
			  	</div>
			</div>
		</div>
	</div>
</body>
</html>