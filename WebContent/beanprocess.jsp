<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="u" class="evan.beans.Student"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
Record:<br>  
<jsp:getProperty property="studentname" name="u"/><br>  
<jsp:getProperty property="roll" name="u"/><br>  
<jsp:getProperty property="grade" name="u" /><br>  

</body>
</html>