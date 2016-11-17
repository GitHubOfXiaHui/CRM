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
	<div class="container" style="margin-top:20px;">
		<div class="panel-group">
			<div class="panel panel-info">
				<div class="panel-heading">会员信息</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-md-2"><strong>单位：</strong></div>
						<div class="col-md-4"><s:property value="client.company" /></div>
						<div class="col-md-2"><strong>职位：</strong></div>
						<div class="col-md-4"><s:property value="client.title" /></div>
					</div>
					<div class="row">
						<div class="col-md-2"><strong>中文名：</strong></div>
						<div class="col-md-4"><s:property value="client.clientName" /></div>
						<div class="col-md-2"><strong>英文名：</strong></div>
						<div class="col-md-4"><s:property value="client.clientEnglishName" /></div>
					</div>
					<div class="row">
						<div class="col-md-2"><strong>手机号：</strong></div>
						<div class="col-md-4"><s:property value="client.mobilePhoneNumber" /></div>
						<div class="col-md-2"><strong>身份证：</strong></div>
						<div class="col-md-4"><s:property value="client.idNumber" /></div>
					</div>
					<div class="row">
						<div class="col-md-2"><strong>地址：</strong></div>
						<div class="col-md-10"><s:property value="client.address" /></div>
					</div>
					<div class="row">
						<div class="col-md-2"><strong>护照：</strong></div>
						<div class="col-md-4"><s:property value="client.passportNumber" /></div>
						<div class="col-md-2"><strong>护照有效期：</strong></div>
						<div class="col-md-4"><s:date name="client.passportValidTime" format="yyyy-MM-dd" /></div>
					</div>
					<div class="row">
						<div class="col-md-2"><strong>通行证：</strong></div>
						<div class="col-md-4"><s:property value="client.accessNumber" /></div>
						<div class="col-md-2"><strong>通行证有效期：</strong></div>
						<div class="col-md-4"><s:date name="client.accessValidTime" format="yyyy-MM-dd" /></div>
					</div>
					<div class="row">
						<div class="col-md-2"><strong>推荐客户来源：</strong></div>
						<div class="col-md-10"><s:property value="client.recommend" /></div>
					</div>
					<div class="row">
						<div class="col-md-2"><strong>座位喜好：</strong></div>
						<div class="col-md-10"><s:property value="client.preferSeat" /></div>
					</div>
					<div class="row">
						<div class="col-md-2"><strong>特别喜好：</strong></div>
						<div class="col-md-10"><s:property value="client.like" /></div>
					</div>
					<div class="row">
						<div class="col-md-2"><strong>常旅客：</strong></div>
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
						<div class="col-md-2"><strong>备注：</strong></div>
						<div class="col-md-10"><s:property value="client.comment" /></div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>