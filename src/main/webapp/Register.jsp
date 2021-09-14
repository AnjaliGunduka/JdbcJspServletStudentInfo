<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Register</h2>
<form action="RegisterController" method="post" onsubmit="return validate();">
			<table style="with: 50%">
				<tr>
					<td>LibId</td>
					<td><input type="text" name="lib" id="fid"/></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input type="text" name="fname" id="lname"/></td>
				</tr>
				<tr>
					<td>Branch</td>
					<td><input type="text" name="branch"id="uname" /></td>
				</tr>
					<tr>
					<td>Section</td>
					<td><input type="password" name="section" id="pass"/></td>
				</tr>
				<tr>
					<td>Semester</td>
					<td><input type="text" name="semester" id="add"/></td>
				</tr>
				<tr>
					<td>YearOfAdm</td>
					<td><input type="text" name="yearofadmin" id="con"/></td>
				</tr></table>
			<input type="submit" name="btn_register"value="register"/></form>
<h3>You have a account?<a href="Login.jsp">Login</a></h3>
</body>
</html>