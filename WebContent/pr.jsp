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

String name= request.getParameter("username");

if(name.compareTo("chandra")==0)
{
	session.setAttribute("username", name);
	response.sendRedirect("mainpage.jsp");
}
else
{
	response.sendRedirect("error1.jsp");
}

%>
</body>
</html>