<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%= "Hello World!" %>
 <form action="welcome.jsp">  
<input type="text" name="uname">  
<input type="submit" value="go"><br/>  
</form>  
 <%! int data=50; %>  
<%= "Value of the variable is:"+data %>  
<%!   
int cube(int n){  
return n*n*n*n;  
}  
%>  
<%= "Cube of 3 is:"+cube(3) %>  

<%--  <%    
 response.sendRedirect("http://www.google.com");  
  --%>
<%
 session.setAttribute("user","hero");  
pageContext.setAttribute("pass","secret",PageContext.SESSION_SCOPE);  
%>
<a href="second.jsp">second jsp page</a>  

<% this.log("message"); %> 



</body>
</html>