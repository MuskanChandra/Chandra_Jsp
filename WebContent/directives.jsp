<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="evanerror.jsp" %>  
  

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.util.Date %>  
<%@ page import="java.util.*" %>
Today is: <%= new Date() 
%>  
<%-- <%= 100/0 %>   --%>
<%-- <%@ page contentType="application/msword" %>   --%>
<%-- Today is: <%= new java.util.Date() %>   --%>
<%@ include file="footer.html" %>  
  
Today is: <%= java.util.Calendar.getInstance().getTime() %>
<%

ArrayList<String> list= new ArrayList<String>();
list.add("hello");
list.add("hi");
list.add("haha");

out.print(list.get(0));


%>

</body>
</html>