<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add User</title>
</head>
<body>
	<form action="/login/submit" method = "post" name = "loginfrom">
		<table>
			<tr>
				<td>用户名:<input name="username" type="text" /></td>
			</tr>
			<tr>
				<td>密码:<input name="password" type="password" /></td>
			</tr>
			<tr>
				<td><input value="登录" type="submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>