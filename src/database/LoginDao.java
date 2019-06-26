package database;
import java.sql.*;

import evan.beans.Login;
import javatpoint.Student;
public class LoginDao {
	public LoginDao() {
		try {
			getconnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String driver = "com.mysql.cj.jdbc.Driver";
	public Connection Con = null;
	public PreparedStatement st;
	public String url = "jdbc:mysql://localhost:3306/school?useSSL=false";

	public void getconnection() throws SQLException {
		try {
			Class.forName(driver);

			Con = DriverManager.getConnection(url, "root", "");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
public ResultSet GetAllLogins()
{
	String sql = "select * from login";
	PreparedStatement st;
	ResultSet rs = null;
	try {
		st = Con.prepareStatement(sql);
		rs = st.executeQuery();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	return rs;
	
}
public boolean IsValidLogin(String user,String pass)
{
	int rowCount = 0;
	String sql = "select * from login where username=? and password=?";
	PreparedStatement st;
	ResultSet rs = null;
	try {
		st = Con.prepareStatement(sql);
		st.setString(1, user);
		st.setString(2, pass);
		rs = st.executeQuery();
		
		while ( rs.next() )
		{
		    // Process the row.
		    rowCount++;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	if(rowCount>0)
	{
		return true;
	}
	return false;
	
	
}
public boolean IsValidLogin(Login l)
{
	int rowCount = 0;
	String sql = "select * from login where username=? and password=?";
	PreparedStatement st;
	ResultSet rs = null;
	try {
		st = Con.prepareStatement(sql);
		st.setString(1, l.getUsername());
		st.setString(2, l.getPassword());
		rs = st.executeQuery();
		
		while ( rs.next() )
		{
		    // Process the row.
		    rowCount++;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	if(rowCount>0)
	{
		return true;
	}
	return false;
	
	
}
	
}