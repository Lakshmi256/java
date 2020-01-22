<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<div
		style="background-color: #0cd9ee; width: 25%; margin-left: 28em; margin-top: 10em;">
		<p style="font-size: 50px; color: red;">Login Page</p>
	</div>
	<form method="post" action="Login">

		<table
			style="background-color: #0cd9ee; width: 27%; margin-left: 27em; margin-top: 0em;">
			<tr>
				<td>User Name</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td></td>
				<td><input value="login" type="submit"></input></td>
			</tr>
		</table>
	</form>
</body>
</html>