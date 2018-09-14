<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Login</title>
        </head>
        <body>
           
           <form action = "loginuser" method = "POST"  modelAttribute= "login">
	<table>
	<thead>Employee Login</thead>
	<tr>

<tr>
	<td>User Id:</td><td><input name="userId" type="text"></td>
	</tr>
	<tr>
		<tr>
	<td>Password :</td><td><input name="password" type="password"></td>
	</tr>

	</table>
	<input type="submit" value="Login">
	</form>
        </body>
        </html>
        
        
        <%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="loginuser">
<table>
	<thead>User Login</thead>
	<tr>
	<td>userId:</td><td><input name="userId" type="text"></td>
	</tr>
	<tr>
	<td>userName</td><td><input name="password" type="text"></td>
	</tr>
	</table>
	<%
        request.setAttribute("userId","userId");
               
	%>
	<%
        request.setAttribute("password","password");
               
	%>
	<input type="submit" value="Login"></td>
	</form>
</body>
</html> --%>