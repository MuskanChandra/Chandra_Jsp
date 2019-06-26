<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int x=5; %>

<% if(x==5)
	{
	out.print("a is 5");
	}
else
{
	out.print("a is not 5");
}
	
	
	%>
</body>
</html>