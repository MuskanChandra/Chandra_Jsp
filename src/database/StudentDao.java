package database;

import java.sql.*;
import java.util.List;

import javatpoint.Student;

import net.proteanit.sql.DbUtils;

public class StudentDao {
	public StudentDao() {
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
public ResultSet GetAllStudents()
{
	String sql = "select * from student";
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
	public int insertstudent(Student s)  {
		int result = 0;
		try {
			String sql = "insert into student(studentname,roll,grade)values(?,?,?)";
			PreparedStatement st = Con.prepareStatement(sql);
			st.setString(1, s.studentname);
			st.setString(2, s.roll);
			st.setString(3, s.grade);
			result = st.executeUpdate();

			System.out.println(String.valueOf(result));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return result;
	}
}