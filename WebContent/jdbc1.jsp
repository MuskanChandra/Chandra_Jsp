<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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

Class.forName(driver);	
Con = DriverManager.getConnection(url, "root", "");

String sql="select * from student";

st = Con.prepareStatement(sql);
rs = st.executeQuery();


%>

<%
while(rs.next())
{
	out.print(rs.getString("name"));
}

Con.close();
%>


</body>
</html>