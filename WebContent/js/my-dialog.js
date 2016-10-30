/**
 * 自定义模态对话框，需要引入jQuery
 * 
 * @author 夏辉
 */
function showDialog(msg, complete) {
	var dialog = "<div class='my-dialog-mask'>"
				+  "<div class='my-dialog'>"
				+    "<div class='my-dialog-title'>提示</div>"
				+    "<div class='my-dialog-content'>"
				+      "<p class='my-dialog-message'>" + msg + "</p>"
				+    "</div>"
				+    "<button class='my-dialog-ok' type='button'>确定</button>"
				+  "</div>"
				+"</div>";
	var $dialog = $(dialog);

	$("body").append($dialog);
	// 确定按钮获得焦点
	$(".my-dialog-ok").trigger("focus");
	// 点击按钮执行回调函数，然后关闭对话框
	$(".my-dialog-ok").click(function() {
		$dialog.remove();
		if (complete) {
			complete();
		}
	});
}
