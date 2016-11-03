<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%-- 从浏览器顶部划出操作成功提示，需要引入Bootstrap样式和jQuery --%>
<div class="alert alert-success" id="result" style="display: none; position: fixed; top: 0; left: 50%; width: 500px; margin-left: -250px;">
	 <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
	 <strong>恭喜!</strong> <s:property value="resultInfo" />
</div>
<script type="text/javascript">
	$(function(){
		$("#result").slideDown(300);
	});
</script>
