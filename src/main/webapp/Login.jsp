<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Login</h2>
	<form method="post" action="LoginController" name="LoginForm"
		onsubmit="return validate();">
		UserName:<input type="text" name="uname"> Password:<input
			type="password" name="upassword"> <input type="submit"
			name="btn_login" value="Login">
		<h3>
			You dont have account? <a href="Register.jsp">Register</a>
		</h3>
	</form>
</body>
</html>