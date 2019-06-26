<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
import="java.lang.*,javatpoint.Student,database.StudentDao,static java.lang.System.out"
    pageEncoding="ISO-8859-1" errorPage="error.jsp" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!

void doo()
{

Student st= new Student();
st.studentname="hari";
st.roll="2";
st.grade="XX";

StudentDao dao= new StudentDao();
      if(dao.insertstudent(st)>0)
      {
    	 
    	   out.print("<h1>Success</h1>");
      }
}

%>
<%
if(request.getParameter("button")!=null)
{
String button = request.getParameter("button");
if(button.equals("button1"))
{
	doo();
	
}
else
{
	out.print("no");
}
}

%>
<form action="#" method="get">
<input type="submit" name="button" value="button1" ></button>
</form>
</body>
</html>