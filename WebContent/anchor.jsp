<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String a=(String)session.getAttribute("var");
out.print(a);
response.sendRedirect("redirect1.jsp");
%>
</body>
</html>