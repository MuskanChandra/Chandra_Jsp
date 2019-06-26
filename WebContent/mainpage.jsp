<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>this is main page of chandra facebook</h1>
<%

String name=session.getAttribute("username").toString();
out.print("You are logged in as "+ name);


%>
</body>
</html>