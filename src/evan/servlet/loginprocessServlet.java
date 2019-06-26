package evan.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.LoginDao;
import evan.beans.Login;


@WebServlet("/loginprocessServlet")
public class loginprocessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	LoginDao dao= new LoginDao();
    public loginprocessServlet() {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		/*
		Login l= new Login();
		l.setUsername(request.getParameter("username"));
		l.setPassword(request.getParameter("password"));
		*/
		PrintWriter out= response.getWriter();
		
		if(dao.IsValidLogin(request.getParameter("username"),request.getParameter("password")))
		{
			
			response.sendRedirect("success.jsp");
		}
		else
		{
		
			response.sendRedirect("fail.jsp");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
