<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%-- 从Application中取到用户权限 --%>
<s:set var="userAuthority" value="#application.authority.get(#session.user)" />

<div class="container text-center">
	<form class="form-inline" action="/CRM/card/searchCardAction" method="post"
		 style="padding-top:10px;padding-bottom:10px;">
		<div class="form-group">
			<label for="cardNo">卡号：</label>
			<input class="form-control" id="cardNo" name="cardNo" type="text" value="<s:property value='cardNo' />">
		</div>
		<div class="form-group">
			<label for="status">卡状态：</label>
			<select class="form-control" id="status" name="status">
				<option value="">请选择</option>
				<s:iterator value="allCardStautses" var="status">
					<option value="<s:property value='#status' />" <s:if test="status == #status">selected</s:if>><s:property value="#status" /></option>
				</s:iterator>
			</select>
		</div>
		<button class="btn btn-primary" type="submit">
			<span class="glyphicon glyphicon-search"></span> 搜索
		</button>
	</form>
	<table class="table table-bordered table-striped table-hover">
		<thead>
			<tr>
				<th class="text-center">#</th>
				<th class="text-center">卡号</th>
				<th class="text-center">卡校验码</th>
				<th class="text-center">卡状态</th>
				<th class="text-center">余额（元）</th>
				<th class="text-center">操作</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="cards" status="st">
				<tr>
					<td><s:property value="#st.index + 1" /></td>
					<td><s:property value="cardNo" /></td>
					<td><s:property value="checkCode" /></td>
					<td><s:property value="status" /></td>
					<td>
						<s:text name="global.format.money">
							<s:param value="balance" />
						</s:text>
					</td>
					<td>
						<a href="/CRM/card/cardDetailsAction?card.cardId=<s:property value='cardId' />" target="_blank">详情</a>
						<s:if test="status == @com.airwxtx.card.entity.CardStatus@NORMAL">
							<s:if test="(@com.airwxtx.authority.entity.AuthorityNumber@FREEZE_CARD_UNLIMITED in #userAuthority) || (@com.airwxtx.authority.entity.AuthorityNumber@FREEZE_CARD_LIMITED in #userAuthority)">
								&nbsp;/&nbsp;<a class="js-freeze" href="/CRM/card/freezeCardAction?card.cardId=<s:property value='cardId' />">冻结</a>
							</s:if>
							
							<s:if test="@com.airwxtx.authority.entity.AuthorityNumber@CHARGE in #userAuthority">
								&nbsp;/&nbsp;<a class="js-charge" href="/CRM/card/cardChargeAction?card.cardId=<s:property value='cardId' />&money=">充值</a>
							</s:if>
							
							<s:if test="@com.airwxtx.authority.entity.AuthorityNumber@PAY in #userAuthority">
								&nbsp;/&nbsp;<a class="js-pay" href="/CRM/card/preCardPayAction?card.cardId=<s:property value='cardId' />" target="_blank">扣款</a>
							</s:if>
						</s:if>
						<s:else>
							<s:if test="@com.airwxtx.authority.entity.AuthorityNumber@UNFREEZE_CARD in #userAuthority">
								&nbsp;/&nbsp;<a class="js-unfreeze" href="/CRM/card/unfreezeCardAction?card.cardId=<s:property value='cardId' />">解冻</a>
							</s:if>
						</s:else>
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
					cardNo: $("#cardNo").val(),
					status: $("#status").val()
				};
				onsearch(url, params);
						
				// 阻止表单默认提交
				return false;
			});
			
			// 冻结
			$(".js-freeze").click(function(){
				$.getJSON($(this).attr("href"), function(data){
					bootbox.setDefaults({locale:"zh_CN"});
					bootbox.alert(data.resultInfo);
				});
				
				return false;
			});
			
			// 解冻
			$(".js-unfreeze").click(function(){
				$.getJSON($(this).attr("href"), function(data){
					bootbox.setDefaults({locale:"zh_CN"});
					bootbox.alert(data.resultInfo);
				});
				
				return false;
			});
			
			// 充值
			$(".js-charge").click(function(){
				var $this = $(this);
				bootbox.setDefaults({locale:"zh_CN"});
				bootbox.prompt({
					title: "充值金额",
				    inputType: "number",
				    callback: function (result) {
				        if (result > 0){
							$.getJSON($this.attr("href") + result, function(data){
								bootbox.alert(data.resultInfo);
							});
				        } else {
				        	bootbox.alert("充值金额无效");
				        }
				    }
				});
				
				return false;
			});

		});
	</script>
</div>