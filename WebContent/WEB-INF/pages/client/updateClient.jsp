<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改客户</title>

<!-- CDN -->
<link href="http://cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>


<script>
$(document).ready(function(){
    $("#btn1").click(function(){
        $("#freq").append(
        		"<div class='col-sm-offset-2 col-sm-9'>"
        	   		+"<input type='text' class='form-control' name='client.frequentFlyers' value='<s:property value='client.frequentFlyers' />'></div>"
        		);
    });
});
</script>

<!-- 导入struts样式 -->
<s:head />

</head>
<body>
	<div class="container" style="margin-top:20px;">
		<div class="panel panel-success">
			<div class="panel-heading">修改会员</div>
			<div class="panel-body">
			<s:fielderror />
				<form class="form-horizontal" role="form" action="/CRM/client/updateClientAction" method="post">
					<input name="client.clientId" value="<s:property value='client.clientId' />" type="hidden">
  					<div class="form-group">
				    	<label class="control-label col-sm-2" for="name">中文姓名:</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" id="name" name="client.clientName" value="<s:property value='client.clientName' />">
					    </div>
				  	</div>
				  	<div class="form-group">
				    	<label class="control-label col-sm-2" for="name">英文姓名:</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" id="name" name="client.clientEnglishName" value="<s:property value='client.clientEnglishName' />">
					    </div>
				  	</div>
				  	<div class="form-group">
				    	<label class="control-label col-sm-2" for="name">手机号:</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" id="name" name="client.mobilePhoneNumber" value="<s:property value='client.mobilePhoneNumber' />">
					    </div>
				  	</div>
				  	<div class="form-group">
				    	<label class="control-label col-sm-2" for="name">单位:</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" id="name" name="client.company" value="<s:property value='client.company' />">
					    </div>
				  	</div>
				  	<div class="form-group">
				    	<label class="control-label col-sm-2" for="name">职称:</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" id="name" name="client.title" value="<s:property value='client.title' />">
					    </div>
				  	</div>
				  	<div class="form-group">
				    	<label class="control-label col-sm-2" for="name">地址:</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" id="name" name="client.address" value="<s:property value='client.address' />">
					    </div>
				  	</div>
				  	<div class="form-group">
				    	<label class="control-label col-sm-2" for="name">身份证号:</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" id="name" name="client.idNumber" value="<s:property value='client.idNumber' />">
					    </div>
				  	</div>
				  	<div class="form-group">
				    	<label class="control-label col-sm-2" for="name">护照号:</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" id="name" name="client.passportNumber" value="<s:property value='client.passportNumber' />">
					    </div>
				  	</div>
				  	<div class="form-group">
				    	<label class="control-label col-sm-2" for="name">护照有效期:</label>
					    <div class="col-sm-10">
					      <input type="date" class="form-control" id="name" name="client.passportValidTime" value="<s:property value='client.passportValidTime' />">
					    </div>
				  	</div>
				  	<div class="form-group">
				    	<label class="control-label col-sm-2" for="name">通行证号:</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" id="name" name="client.accessNumber" value="<s:property value='client.accessNumber' />">
					    </div>
				  	</div>
				  	<div class="form-group">
				    	<label class="control-label col-sm-2" for="name">通行证有效期:</label>
					    <div class="col-sm-10">
					      <input type="date" class="form-control" id="name" name="client.accessValidTime" value="<s:property value='client.accessValidTime' />">
					    </div>
				  	</div>
				  	<div class="form-group">
				    	<label class="control-label col-sm-2" for="name">座位喜好:</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" id="name" name="client.preferSeat" value="<s:property value='client.preferSeat' />">
					    </div>
				  	</div>
				  	<div class="form-group">
				    	<label class="control-label col-sm-2" for="name">推荐来源:</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" id="name" name="client.recommend" value="<s:property value='client.recommend' />">
					    </div>
				  	</div>
				  	<div class="form-group">
				    	<label class="control-label col-sm-2" for="name">特别喜好:</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" id="name" name="client.like" value="<s:property value='client.like' />">
					    </div>
				  	</div>
				 	<div id="freq" class="form-group">
				    	<label class="control-label col-sm-2" for="freq">常旅客:</label>
				    	<s:iterator value="client.frequentFlyers" >
				    		<div class="col-sm-offset-2 col-sm-9">
					      		<input type="text" class="form-control" name="client.frequentFlyers" value="<s:property />">
					    	</div>
				    	</s:iterator>
					    <div class="col-sm-1">
					    	 <button id="btn1" type="button" class="btn btn-default btn-sm">
          						<span class="glyphicon glyphicon-plus-sign"></span>添加
       				 		 </button>
					    </div>
				  	</div>
				    <div class="form-group">
				    	<div class="col-sm-offset-2 col-sm-10">
				      		<button type="submit" class="btn btn-success">提交</button>
				    	</div>
				  	</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>