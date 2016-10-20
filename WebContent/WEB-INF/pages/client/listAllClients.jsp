<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
				<th>#</th>
				<th>单位</th>
				<th>姓名</th>
				<th>操作</th>
			</tr>
			<s:iterator value="clients" status="i">
				<tr>
					<td><s:property value="#i.index" /></td>
					<td><s:property value="company" /></td>
					<td><s:property value="clientName" /></td>
					<td><a
						href="/CRM/client/showClientDetailsAction?clientId=<s:property value='clientId' />">查看</a></td>
				</tr>
			</s:iterator>
		</table>
	</div>
</body>
</html>