<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Failuare</title>
</head>
<body>
<h3>Incorrect Data</h3>
<%
	String s = (String)request.getAttribute("u");
	out.println("USername >>"+ s);
%>
</body>
</html>