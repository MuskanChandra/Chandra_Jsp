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
<c:set var="income"  value="${10}"/>  
<c:out value="${income}"/>  



<c:if test="${income > 5}">  
   <p>My income is: <c:out value="${income}"/><p>  
</c:if>  



<c:forEach var="j" begin="1" end="3">  
   Item <c:out value="${j}"/><p>  
</c:forEach>  

</body>
</html>