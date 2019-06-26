<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>here</h1>
<%
String s=request.getHeader("User-Agent");
//out.print(s);
Cookie[] cookies=request.getCookies();
Cookie cookie;
for(int i=0;i<cookies.length;i++)
{
	cookie=cookies[i];
	if(cookie.getName().compareTo("a")==0)
	{
		out.print(cookie.getValue());
	}
}

String val=(String)session.getAttribute("ab");
out.print(val);
%>
</body>
</html>