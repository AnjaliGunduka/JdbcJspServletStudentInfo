<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h2>
<%
if(session.getAttribute("login")==null || session.getAttribute("login")==" ")
{
	response.sendRedirect("Login.jsp");
}
%>
welcome,<%=session.getAttribute("login") %>
</h2>
<h3>
<a href="Logout.jsp">Logout</a>


</h3>
</center>
</body>
</html>