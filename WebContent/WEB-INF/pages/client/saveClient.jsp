<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
<title>创建会员</title>
<meta charset="UTF-8">

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

<script>
$(function(){
	var freq = "<div class='col-md-offset-2 col-md-9' style='padding-top:10px;'>"
			+    "<input type='text' class='form-control' name='client.frequentFlyers'>"
			+  "</div>";
    $("#add").click(function(){
        $("#freqs").append(freq);
    });
});
</script>

<style type="text/css">
.container {
	padding-top: 20px;
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
			<div class="panel-heading">新建会员</div>
			<div class="panel-body">
				<form class="form-horizontal" action="/CRM/client/saveClientAction" method="post">
					<div class="form-group">
						<label class="control-label col-md-2" for="company">单位：</label>
						<div  class="col-md-4">
							<input type="text" class="form-control" id="company" name="client.company">
						</div>
						<label class="control-label col-md-2" for="title">职位：</label>
						<div  class="col-md-4">
							<input type="text" class="form-control" id="title" name="client.title">
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-2" for="clientName">中文名：</label>
						<div  class="col-md-4">
							<input type="text" class="form-control" id="clientName" name="client.clientName">
						</div>
						<label class="control-label col-md-2" for="clientEnglishName">英文名：</label>
						<div  class="col-md-4">
							<input type="text" class="form-control" id="clientEnglishName" name="client.clientEnglishName">
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-2" for="mobilePhoneNumber">手机号：</label>
						<div  class="col-md-4">
							<input type="text" class="form-control" id="mobilePhoneNumber" name="client.mobilePhoneNumber">
						</div>
						<label class="control-label col-md-2" for="idNumber">身份证：</label>
						<div  class="col-md-4">
							<input type="text" class="form-control" id="idNumber" name="client.idNumber">
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-2" for="passportNumber">护照：</label>
						<div  class="col-md-4">
							<input type="text" class="form-control" id="passportNumber" name="client.passportNumber">
						</div>
						<label class="control-label col-md-2" for="passportValidTime">护照有效期：</label>
						<div class="input-group date form_date col-md-4" id="passportValidTime" data-date-format="yyyy-mm-dd" style="padding-right: 15px;padding-left: 15px;">
                    		<input class="form-control" name="client.passportValidTime" type="text" readonly>
                    		<span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                		</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-2" for="accessNumber">通行证：</label>
						<div  class="col-md-4">
							<input type="text" class="form-control" id="accessNumber" name="client.accessNumber">
						</div>
						<label class="control-label col-md-2" for="accessValidTime">通行证有效期：</label>
						<div class="input-group date form_date col-md-4" id="accessValidTime" data-date-format="yyyy-mm-dd" style="padding-right: 15px;padding-left: 15px;">
                    		<input class="form-control" name="client.accessValidTime" type="text" readonly>
                    		<span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                		</div>
					</div>
										
					<div class="form-group">
						<label class="control-label col-md-2" for="address">住址：</label>
						<div  class="col-md-10">
							<input type="text" class="form-control" id="address" name="client.address">
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-2" for="recommend">推荐客户来源：</label>
						<div  class="col-md-10">
							<input type="text" class="form-control" id="recommend" name="client.recommend">
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-2" for="preferSeat">座位喜好：</label>
						<div  class="col-md-10">
							<input type="text" class="form-control" id="preferSeat" name="client.preferSeat">
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-2" for="like">特别喜好：</label>
						<div  class="col-md-10">
							<input type="text" class="form-control" id="like" name="client.like">
						</div>
					</div>
					
				 	<div id="freqs" class="form-group">
				    	<label class="control-label col-md-2" for="freqs">常旅客：</label>
					    <div class="col-md-9">
					      	<input type="text" class="form-control" name="client.frequentFlyers">
					    </div>
					    <div class="col-md-1">
					    	 <button class="btn btn-success" id="add" type="button">
          						<span class="glyphicon glyphicon-plus"></span>
       				 		 </button>
					    </div>
				  	</div>
				  	
				    <div class="form-group">
				    	<div class="col-md-offset-2 col-md-10">
				      		<button type="submit" class="btn btn-success">提交</button>
				    	</div>
				  	</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>