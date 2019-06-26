<%@page import="mvc.LoginBean"%>  
 
<p>You are successfully logged in!</p>  
<%  
LoginBean bean=(LoginBean)request.getAttribute("bean");  
out.print("Welcome, "+bean.getName());  
%>  
