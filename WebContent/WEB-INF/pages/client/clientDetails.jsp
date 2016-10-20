<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<table>
			<tr>
				<th>中文姓名</th>
				<th>英文姓名</th>
				<th>手机号</th>
				<th>单位</th>
				<th>职称</th>
				<th>住址</th>
				<th>身份证号</th>
				<th>护照号</th>
				<th>护照有效期</th>
				<th>通行证号</th>
				<th>通行证有效期</th>
				<th>座位喜好</th>
				<th>推荐客户来源</th>
				<th>特别喜好</th>
			</tr>
			<tr>
				<td><s:property value="client.clientName" /></td>
				<td><s:property value="client.clientEnglishName" /></td>
				<td><s:property value="client.mobilePhoneNumber" /></td>
				<td><s:property value="client.company" /></td>
				<td><s:property value="client.title" /></td>
				<td><s:property value="client.address" /></td>
				<td><s:property value="client.IDNumber" /></td>
				<td><s:property value="client.passportNumber" /></td>
				<td><s:property value="client.passportValidTime" /></td>
				<td><s:property value="client.accessNumber" /></td>
				<td><s:property value="client.accessValidTime" /></td>
				<td><s:property value="client.preferSeat" /></td>
				<td><s:property value="client.recommend" /></td>
				<td><s:property value="client.like" /></td>
			</tr>
		</table>
	</div>
</body>
</html>