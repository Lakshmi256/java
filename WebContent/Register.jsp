<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<div style="background-color: #0cd9ee; width: 25%; margin-left: 28em;">
		<p style="font-size: 35px; color: red;">Registration Page</p>
	</div>

	<form method="post" action="Register">
		<table
			style="background-color: #0cd9ee; width: 27%; margin-left: 27em; margin-top: 0em;">
			<tr>
				<td>First Name</td>
				<td><input type="text" name="Fname"></td>
			</tr>
			<tr>
				<td>last name</td>
				<td><input type="text" name="Lname"></td>
			</tr>
			<tr>
				<td>email id</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>phone no</td>
				<td><input type="text" name="phoneno"></td>
			</tr>
			<tr>
				<td>city</td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td>state</td>
				<td><input type="text" name="state"></td>
			</tr>
			<tr>
				<td>nationality</td>
				<td><input type="text" name="country"></td>
			</tr>
			<tr>
				<td>pin code</td>
				<td><input type="text" name="pin"></td>
			</tr>
			<tr>
				<td>user name</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>password</td>
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