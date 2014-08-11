<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta charset="utf-8">

<!-- css -->
<link rel=stylesheet href="resources/css/jquery.mobile-1.4.3.min.css">
<link rel=stylesheet href="resources/css/jquery-ui.min.css">

<!-- js -->
<script src="resources/js/jquery.min.js"></script>
<script src="resources/js/jquery-ui.min.js"></script>
<script src="resources/js/jquery.ui.datepicker.mobile.js"></script>
<script src="resources/js/jquery.mobile-1.4.3.min.js"></script>

<title>登录</title>
</head>
<body>

	<div data-role="page">

		<div data-role="header">
		<h1>LUCK HOUSE</h1>
		</div>

		<div data-role="content">
			<input type="text" id="login_username" name="login_username"
				placeholder="用户名">
			<input type="text" id="login_username"
				name="login_username" placeholder="密码">
				<input type="button" value="登录">
		</div>

		<div data-role="footer">
		</div>

	</div>

</body>
</html>
