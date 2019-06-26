<%@ page import="java.util.*,Chandra_Beans.*" %>  
<%  
LoginDao d= new LoginDao();
String spageid=request.getParameter("page");  
int pageid=Integer.parseInt(spageid);  
int total=10;  
if(pageid==1){}  
else{  
    pageid=pageid-1;  
    pageid=pageid*total+1;  
}  
List<Login> list=d.getRecords(pageid,total);  
  
out.print("<h1>Page No: "+spageid+request.getParameter("x")+ "</h1>");  
out.print("<table border='1' cellpadding='4' width='60%'>");  
out.print("<tr><th>Id</th><th>Name</th><th>Salary</th>");  
for(Login e:list){  
    out.print("<tr><td>"+e.getUserid()+"</td><td>"+e.getUsername()+"</td><td>"+e.getUsername()+"</td></tr>");  
}  
out.print("</table>");  
%>  
<a href="pagination.jsp?page=1&x=3">1</a>  
<a href="pagination.jsp?page=2&x=3">2</a>  
<a href="pagination.jsp?page=3&x=3">3</a>  </html>