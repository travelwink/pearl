<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">

<title>Document</title>
</head>
<body>
	<header>
		<h1 class="text-muted">珍珠理财</h1>
	</header>
	<form action="user/login.do" method="post">
		<div class="form-group">
			<input type="text" name="mobile" placeholder="手机号" />
		</div>
		<div class="form-group">
			<input type="password" name="password" placeholder="密码" />
		</div>
		<div class="form-group">
			<input class="btn btn-info" type="submit" value="登录">
		</div>
	</form>
	<footer class="footer">@pearl finance</footer>
	<script src="assets/bootstrap/bootstrap.min.js"></script>
	<script src="assets/jquery/jquery-3.2.1.min.js"></script>
</body>
</html>
