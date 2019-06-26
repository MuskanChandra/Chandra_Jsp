package Chandra_Beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ChandraDao 
{

	

	 public static ResultSet GetStudents() throws ClassNotFoundException, SQLException
	 {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/studentt?useSSL=false","root","");
			String sqlk= "select * from studenttable";
			 PreparedStatement stmt= con.prepareStatement(sqlk);
			 ResultSet rs=stmt.executeQuery();
			 
			 
			return rs;
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		 
	 }
	 
	/* public static void insert() throws ClassNotFoundException, SQLException
	 {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con= DriverManager.getConnection("jdbc:mysql://localhost/school?useSSL=false","root","");
		 String sqlk= "insert into student(name,roll,address) values (?,?,?)";
		 
		 PreparedStatement stmt= con.prepareStatement(sqlk);
		 
		 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter studnet");
		    String Name = myObj.nextLine();  // Read user input
		    
		    System.out.println("Enter customerdetail");
		    String detail = myObj.nextLine();  // Read user input
		    
		    System.out.println("Enter customeraddress");
		    String address = myObj.nextLine();  // Read user input
		   
		 stmt.setString(1, Name);
		 stmt.setString(2, detail);
		 stmt.setString(3, address);
		 stmt.executeUpdate();
		 con.close();

	 }
	 public static void update() throws ClassNotFoundException, SQLException
	 {
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter id to update");
		 int id= Integer.parseInt(s.nextLine());
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con= DriverManager.getConnection("jdbc:mysql://localhost/school?useSSL=false","root","");
		 String sqlk= "update student set name=?,roll=?,address=? where studentid=?";
		 
		 PreparedStatement stmt= con.prepareStatement(sqlk);
		 
		 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter new customername");
		    String Name = myObj.nextLine();  // Read user input
		    
		    System.out.println("Enter new customerdetail");
		    String detail = myObj.nextLine();  // Read user input
		    
		    System.out.println("Enter new customeraddress");
		    String address = myObj.nextLine();  // Read user input
		   
		 stmt.setString(1, Name);
		 stmt.setString(2, detail);
		 stmt.setString(3, address);
		 stmt.setInt(4,id);
		 stmt.executeUpdate();
		 con.close();
	 }
	 public static void delete() throws ClassNotFoundException, SQLException
	 {
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter id to delete");
		 int id= Integer.parseInt(s.nextLine());
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con= DriverManager.getConnection("jdbc:mysql://localhost/school?useSSL=false","root","");
		 String sqlk= "delete from costumer where costumerid=?";
		 
		 PreparedStatement stmt= con.prepareStatement(sqlk); 
		
		 
		 stmt.setInt(1,id);
		 stmt.executeUpdate();
		 con.close();
	 }*/
}
