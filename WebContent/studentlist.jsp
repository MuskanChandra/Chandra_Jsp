<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="net.proteanit.sql.DbUtils,java.util.*,javatpoint.Student,java.sql.*,database.StudentDao,java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="styles/bootstrap.css" rel="stylesheet" />
</head>
<body>
<%!
ResultSet rs;

int i=0;
void getallstudents()
{

Student s;
StudentDao dao= new StudentDao();
    rs=  dao.GetAllStudents();
}

%>
<table class="table table-bordered">
<tr>
<th>Id</th>
<th>Name</th>
<th>Roll</th>
<th>Grade</th>
</tr>
<%-- <% 
// doo();

// List<Student> slist=new ArrayList<Student>();
// //rs.beforeFirst();
//     slist=DbUtils.resultSetToNestedList(rs);
   
// 	Iterator<Student> it=slist.iterator();

// 	while(it.hasNext())
// 	{
// 		Student s= it.next();
	
%> --%>

<%-- <tr><td><%= s.studentname %></td> --%>
<%-- <td><%= s.studentname %></td> --%>
<%-- <td><%= s.studentname %></td> --%>
<%-- <td><%= s.studentname %></td> --%>
<!-- </tr> -->
<%-- <%} %> --%>
<%
//rs.beforeFirst();
//getallstudents();
StudentDao dao= new StudentDao();
 
ResultSet rs=dao.GetAllStudents();
 while(rs.next())
{ 
	 
%>
<tr><td><%=rs.getString("studentid")%></td>
<td><%=rs.getString("studentname")%></td>
<td><%=rs.getString("roll")%></td>
<td><%=rs.getString("grade")%></td>
</tr>

<% 
}
 %>
</table>
</body>
</html>