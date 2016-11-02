/**
 * 自定义模态对话框，需要引入jQuery
 * @author 夏辉
 */
function showMessageDialog(msg, complete){
  var dialog = "<div class='dialog-mask'>"
              +  "<div class='dialog'>"
              +    "<div class='dialog-title'>提示</div>"
              +    "<div class='dialog-content'>"
              +      "<img class='dialog-icon' src='info.png' alt='i'>"
              +      "<p class='dialog-message'>" + msg + "</p>"
              +    "</div>"
              +    "<button>确定</button>"
              +  "</div>"
              +"</div>";
  var $dialog = $(dialog);
  $("body").append($dialog);
  // 确定按钮获得焦点
  $("button").trigger("focus");
  // 点击按钮执行回调函数，然后关闭对话框
  $("button").click(function(){
    if(complete){
      complete();
    }
    $dialog.remove();
  });
}
