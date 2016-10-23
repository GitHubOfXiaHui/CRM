/**
 * 自定义模态对话框，需要引入jQuery
 * 
 * @author 夏辉
 */
function showDialog(type, msg, complete) {
	var imgSrc;
	if (type == "info") {
		imgSrc = "/CRM/images/info.png";
	} else if (type == "error") {
		imgSrc = "/CRM/images/error.png";
	}
	var dialog = "<div class='dialog-mask'>"
				+  "<div class='dialog'>"
				+    "<div class='dialog-title'>提示</div>"
				+    "<div class='dialog-content'>"
				+      "<img class='dialog-icon' src='" + imgSrc + "' alt='icon'>"
				+      "<p class='dialog-message'>" + msg + "</p>"
				+    "</div>"
				+    "<button class='dialog-ok'>确定</button>"
				+  "</div>"
				+"</div>";
	var $dialog = $(dialog);

	$("body").append($dialog);
	// 确定按钮获得焦点
	$("button.dialog-ok").trigger("focus");
	// 点击按钮执行回调函数，然后关闭对话框
	$("button").click(function() {
		if (complete) {
			complete();
		}
		$dialog.remove();
	});
}

function showMessageDialog(msg, complete) {
	showDialog("info", msg, complete);
}

function showErrorDialog(msg, complete) {
	showDialog("error", msg, complete);
}
