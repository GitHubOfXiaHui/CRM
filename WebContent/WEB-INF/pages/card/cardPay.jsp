<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
<title>扣款</title>
<meta charset="utf-8">

<!-- Bootstrap样式 -->
<link rel="stylesheet" href="/CRM/css/bootstrap.min.css">
<script src="/CRM/js/jquery.min.js" type="text/javascript"></script>
<script src="/CRM/js/bootstrap.min.js" type="text/javascript"></script>

<!-- Bootstrap-datetimepicker -->
<link rel="stylesheet" href="/CRM/css/bootstrap-datetimepicker.min.css">
<script src="/CRM/js/bootstrap-datetimepicker.min.js" type="text/javascript" charset="UTF-8"></script>
<script src="/CRM/js/bootstrap-datetimepicker.zh-CN.js" type="text/javascript" charset="UTF-8"></script>
<script type="text/javascript">
	// 设置datetimepicker参数
	$(function(){
		$(".form_date").datetimepicker({
	        language:  "zh-CN",
	        todayBtn:  "linked",
			autoclose: true,
			todayHighlight: true,
			minView: "month",
			pickerPosition: "bottom-left",
			forceParse: false
	    });
	});
</script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<script src="/CRM/js/html5shiv.min.js" type="text/javascript"></script>
<script src="/CRM/js/respond.min.js" type="text/javascript"></script>

<style type="text/css">
.container {
	padding-top: 20px;
	padding-right: 20%;
	padding-left: 20%;
}
</style>

<s:head />
</head>
<body>
	<div class="container">
		<div class="panel panel-info">
			<div class="panel-heading">扣款</div>
			<div class="panel-body">
				<form class="form-horizontal" action="/CRM/card/cardPayAction"
					method="post">
					<s:fielderror />
					<div class="form-group">
						<input name="card.cardId" value="<s:property value='card.cardId' />" type="hidden">
						<label class="control-label col-md-2">卡号：</label>
						<div class="col-md-4">
							<p class="form-control-static"><s:property value="card.cardNo" /></p>
						</div>
						<label class="control-label col-md-2">余额：</label>
						<div class="col-md-4">
							<input name="card.balance" value="<s:property value='card.balance' />" type="hidden">
							<p class="form-control-static">
								<s:text name="global.format.money">
									<s:param value="card.balance" />
								</s:text>
							</p>
						</div>
					</div>
					<hr>
					
					<div class="form-group">
						<label class="control-label col-md-2" for="fltNo">航班号：</label>
						<div class="col-md-5">
							<input class="form-control" id="fltNo" name="recode.fltNo" type="text" value="<s:property value='recode.fltNo' />">
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-2" for="route">行程：</label>
						<div class="col-md-5">
							<input class="form-control" id="route" name="recode.route" type="text" value="<s:property value='recode.route' />">
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-2" for="flightDate">航班日期：</label>
						<div class="input-group date form_date col-md-5" id="flightDate" data-date-format="yyyy-mm-dd" style="padding-right: 15px;padding-left: 15px;">
                    		<input class="form-control" name="recode.flightDate" type="text" readonly>
                    		<span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                		</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-2" for="consumption">消费金额：</label>
						<div class="col-md-5">
							<input class="form-control" id="consumption" name="recode.consumption" type="text" value="<s:property value='recode.consumption' />">
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-2" for=comment>备注：</label>
						<div class="col-md-10">
							<textarea class="form-control" id="comment" name="recode.comment" rows="5">
								<s:property value="recode.comment" />
							</textarea>
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-md-offset-2 col-md-5">
							<input class="btn btn-success" type="submit" value="确定">
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
