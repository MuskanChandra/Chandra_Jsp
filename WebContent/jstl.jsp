<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="j" begin="1" end="3"> 
   Item <c:out value="${j}"/>
</c:forEach>
<c:out value="${'jstl'}"/>
<%-- <c:import url="http://www.google.com"></c:import> --%>

<c:catch var ="catchtheException">  
   <% int x = 2/0;%>  
</c:catch>  
  
<c:if test ="${catchtheException!=null}">  
   <p>The type of exception is : ${catchtheException} <br/>  
   There is an exception: ${catchtheException.message}</p>  
</c:if>  
</body>
</html>