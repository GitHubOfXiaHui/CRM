/**
 * 表单提交时对密码进行md5加密，需要引入jQuery和jQuery.md5
 * 
 * @author 夏辉
 */
$(function() {
	$("form").submit(function() {
		var $passwords = $("input[type='password']");
		$passwords.each(function() {
			if ($.trim($(this).val()) != "") {
				$(this).val($.md5($(this).val()));
			}
		});
	});
});