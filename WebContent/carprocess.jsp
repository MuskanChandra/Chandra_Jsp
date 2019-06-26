<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="mycar" class="evan.beans.Car" ></jsp:useBean>
<jsp:setProperty property="*" name="mycar"/>


<%

out.print(mycar.getCarid());
out.print(mycar.getCarname());
out.print(mycar.getCarmodel());


%>
 <br />
 
 <jsp:getProperty property="carid" name="mycar"/><br>  
<jsp:getProperty property="carname" name="mycar"/><br>  
<jsp:getProperty property="carmodel" name="mycar" /><br>  
 


</body>
</html>