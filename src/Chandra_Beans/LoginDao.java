package Chandra_Beans;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LoginDao {

	public static String DatabaseName = "school";
	public static String DatabaseUrl = "jdbc:mysql://localhost:3306/" + DatabaseName + "?useSSL=false";
	public static String DatabaseUser = "root";
	public static String DatabasePassword = "";
	public static String DatabaseDriver = "com.mysql.cj.jdbc.Driver";
	public static Connection con = null;

	public LoginDao() throws ClassNotFoundException, SQLException {
		Class.forName(DatabaseDriver);
		con = DriverManager.getConnection(DatabaseUrl, DatabaseUser, DatabasePassword);

	}

	public boolean loginprocess(String un, String pw) {
		
		String sql = "select * from login where username=? and password=? ";
		PreparedStatement st;
		try {
			st = con.prepareStatement(sql);
			st.setString(1, un);
			st.setString(2, pw);
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				return true;
			}
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;

	}
	public static List<Login> getRecords(int start,int total){  
        List<Login> list=new ArrayList<Login>();  
        try{  
            
            PreparedStatement ps=con.prepareStatement(  
"select * from login limit "+(start-1)+","+total);  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Login e=new Login();  
                e.setUserid(rs.getInt(1));  
                e.setUsername(rs.getString(2));  
                e.setPassword(rs.getString(3));  
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){System.out.println(e);}  
        return list;  
    }  

	public boolean Registerprocess(String email, String pw) {
		String sql = "insert into login(username,password) values (?,?)";
		PreparedStatement st;
		try {
			st = con.prepareStatement(sql);
			st.setString(1, email);
			st.setString(2, pw);
			if(st.executeUpdate()>0)
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}
}
