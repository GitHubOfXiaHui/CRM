<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>创建新会员卡</title>

<!-- Bootstrap样式 -->
<link rel="stylesheet" href="/CRM/css/bootstrap.min.css">
<script src="/CRM/js/jquery.min.js" type="text/javascript"></script>
<script src="/CRM/js/bootstrap.min.js" type="text/javascript"></script>

<!-- 导入struts样式 -->
<s:head />

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<script src="/CRM/js/html5shiv.min.js" type="text/javascript"></script>
<script src="/CRM/js/respond.min.js" type="text/javascript"></script>

</head>
<body>
	<div class="container" style="margin-top:20px;">
		<div class="panel panel-success">
			<div class="panel-heading">添加会员卡</div>
			<div class="panel-body">
			<s:fielderror />
				<form class="form-horizontal" role="form" action="/CRM/card/saveCardAction" method="post">
  					<div class="form-group">
				    	<label class="control-label col-sm-2" for="name">会员卡号:</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" id="name" name="card.id" value="<s:property value='card.id' />">
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