package com.evan.database;

//STEP 1. Import required packages
import java.sql.*;

public class CloudDatabase {
// JDBC driver name and database URL
static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
static final String DB_URL = "jdbc:mysql://db4free.net:3306/mysqlcloudevan?user=mysqlusername&password=mysqlpassword&useSSL=false";



public static void main(String[] args) {
Connection conn = null;
Statement stmt = null;
try{
  //STEP 2: Register JDBC driver
  Class.forName(JDBC_DRIVER);

  //STEP 3: Open a connection
  System.out.println("Connecting to database...");
  conn = DriverManager.getConnection(DB_URL);

  //STEP 4: Execute a query
  System.out.println("Creating statement...");
  stmt = conn.createStatement();
  String sql;
  sql = "SELECT studentid,studentname FROM student";
  ResultSet rs = stmt.executeQuery(sql);

  //STEP 5: Extract data from result set
  while(rs.next()){
     //Retrieve by column name
     int id  = rs.getInt("studentid");
    
     String studentname = rs.getString("studentname");

     //Display values
     System.out.print("ID: " + id);
     
     System.out.println(", name: " + studentname);
  }
  //STEP 6: Clean-up environment
  rs.close();
  stmt.close();
  conn.close();
}catch(SQLException se){
  //Handle errors for JDBC
  se.printStackTrace();
}catch(Exception e){
  //Handle errors for Class.forName
  e.printStackTrace();
}finally{
  //finally block used to close resources
  try{
     if(stmt!=null)
        stmt.close();
  }catch(SQLException se2){
  }// nothing we can do
  try{
     if(conn!=null)
        conn.close();
  }catch(SQLException se){
     se.printStackTrace();
  }//end finally try
}//end try
System.out.println("Goodbye!");
}//end main
}//end FirstExample