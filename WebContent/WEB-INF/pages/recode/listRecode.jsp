<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%-- 从Application中取到用户权限 --%>
<s:set var="userAuthority" value="#application.authority.get(#session.user)" />

<div class="container text-center">
	<form class="form-inline" action="/CRM/recode/searchRecodeAction" method="post"
		 style="padding-top:10px;padding-bottom:10px;">
		<div class="form-group">
			<label for="fltNo">航班号：</label>
			<input class="form-control" id="fltNo" name="fltNo" type="text" value="<s:property value='fltNo' />">
		</div>
		<div class="form-group">
			<label for="route">行程：</label>
			<input class="form-control" id="route" name="route" type="text" value="<s:property value='route' />">
		</div>
		<button class="btn btn-primary" type="submit">
			<span class="glyphicon glyphicon-search"></span> 搜索
		</button>
		<s:if test="@com.airwxtx.authority.entity.AuthorityNumber@EXPORT_RECORD in #userAuthority">
			<a class="btn btn-info" href="/CRM/recode/exportRecodeAction" target="_blank">
				<span class="glyphicon glyphicon-download"></span> 导出
			</a>
		</s:if>
	</form>
	<table class="table table-bordered table-striped table-hover">
		<thead>
			<tr>
				<th class="text-center">#</th>
				<th class="text-center">航班号</th>
				<th class="text-center">行程</th>
				<th class="text-center">航班日期</th>
				<th class="text-center">消费金额（元）</th>
				<th class="text-center">操作</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="recodes" status="st">
				<tr>
					<td><s:property value="#st.index + 1" /></td>
					<td><s:property value="fltNo" /></td>
					<td><s:property value="route" /></td>
					<td><s:date name="flightDate" format="yyyy-MM-dd" /></td>
					<td>
						<s:text name="global.format.money">
							<s:param value="consumption" />
						</s:text>
					</td>
					<td>
						<a href="/CRM/recode/detailAction?recode.recodeId=<s:property value='recodeId' />" target="_blank">详情</a>
						<s:if test="(@com.airwxtx.authority.entity.AuthorityNumber@DELETE_RECORD_UNLIMITED in #userAuthority) || (@com.airwxtx.authority.entity.AuthorityNumber@DELETE_RECORD_LIMITED in #userAuthority)">
							&nbsp;/&nbsp;<a class="js-delete" href="/CRM/recode/deleteAction?recode.recodeId=<s:property value='recodeId' />">删除</a>
						</s:if>
					</td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
	<div class="pagination" style="margin-top:-10px;">
		<a href="#" class="first" data-action="first">&laquo;</a> 
		<a href="#" class="previous" data-action="previous">&lsaquo;</a>
		<input type="text" readonly="readonly" data-max-page="<s:property value='maxPage' />">
		<a href="#" class="next" data-action="next">&rsaquo;</a>
		<a href="#" class="last" data-action="last">&raquo;</a>
	</div>
	<script type="text/javascript">
		$(function(){
			// 拦截搜索动作
			$("form").submit(function(){
				var url = $(this).attr("action");
				var params = {
					fltNo: $("#fltNo").val(),
					route: $("#route").val()
				};
				onsearch(url, params);
						
				// 阻止表单默认提交
				return false;
			});
					
			// 拦截删除消费记录
			$(".js-delete").each(function(){
				var $this = $(this);
				$this.click(function(){
					bootbox.setDefaults({locale:"zh_CN"});
					bootbox.confirm("确定要删除该条消费记录吗？", function(result){
						if(result){
							$.getJSON($this.attr("href"), function(data){
								bootbox.alert(data.resultInfo/* , function(){
									$this.closest("tr").remove();
								} */);
							});
						}
					});
							
					// 阻止默认提交
					return false;
				});
			});
		});
	</script>
</div>