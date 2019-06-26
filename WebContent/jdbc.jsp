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
public String driver = "com.mysql.cj.jdbc.Driver";
public Connection Con = null;
public PreparedStatement st;
public ResultSet rs = null;
public String url = "jdbc:mysql://localhost:3306/school?useSSL=false";

%>
<%
try {
	Class.forName(driver);	
	Con = DriverManager.getConnection(url, "root", "");
	String sql = "select * from student";
	st = Con.prepareStatement(sql);
	rs = st.executeQuery();
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



%>

<table class="table table-bordered">
<tr>
<th>Id</th>
<th>Name</th>
<th>Roll</th>
<th>Grade</th>
</tr>
<%
 while(rs.next())
{  %>
<tr><td><%=rs.getString("studentid")%></td>
<td><%=rs.getString("name")%></td>
<td><%=rs.getString("roll")%></td>
<td><%=rs.getString("address")%></td>
</tr>
<% } %>
</table>
</body>
</html>