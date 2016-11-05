<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
<title>添加会员卡</title>
<meta charset="UTF-8">

<!-- Bootstrap样式 -->
<link rel="stylesheet" href="/CRM/css/bootstrap.min.css">
<script src="/CRM/js/jquery.min.js" type="text/javascript"></script>
<script src="/CRM/js/bootstrap.min.js" type="text/javascript"></script>

<style type="text/css">
.container {
	padding-top: 20px;
	padding-right: 20%;
	padding-left: 20%;
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
			<div class="panel-heading">添加会员卡</div>
			<div class="panel-body">
				<form class="form-horizontal" action="/CRM/client/addCardAction"
					method="post">
					<!-- 隐藏会员id -->
					<input type="hidden" name="client.clientId"
						value="<s:property value='client.clientId' />">

					<div class="form-group">
						<label class="control-label col-sm-2" for="cardNo">会员卡号：</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="cardNo"
								name="card.cardNo">
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-2" for="checkCode">卡校验码：</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="checkCode"
								name="card.checkCode">
						</div>
					</div>
					
				  	<div class="row">
				    	<label class="control-label col-sm-2" for="phone"><strong>手机号：</strong></label>
					    <div class="col-sm-10">
							<input type="text" class="form-control" id="phone"
								name="card.phone">
						</div>
				  	</div>

					<div class="form-group">
						<label class="control-label col-sm-2" for="status">卡状态：</label>
						<div class="col-sm-10">
							<p class="form-control-static">
								<s:property value="@com.airwxtx.card.entity.CardStatus@NORMAL" />
							</p>
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-2" for="balance">余额：</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="balance"
								name="card.balance" placeholder="0">
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-success">添加</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>