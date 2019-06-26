<%@page import="java.util.Calendar"%>
<%@page import="com.sun.corba.se.impl.javax.rmi.CORBA.Util"%>
<%@page import="com.sun.xml.internal.ws.wsdl.writer.document.xsd.Import"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %>  
<% out.print("Today is:"+Calendar.getInstance().getTime()); %>  
<%= request.getParameter("name") %>  
</body>
</html>