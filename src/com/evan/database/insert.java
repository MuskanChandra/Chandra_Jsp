package com.evan.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert {

	public static void main(String[] args) {
		try {
			//insertdata();
			updatedata();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void updatedata() throws ClassNotFoundException, SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc." + "Driver");
			String url = "jdbc:mysql://localhost/EMP?useSSL=false";
			Connection Con = DriverManager.getConnection(url, "root", "");
			String sql = "update employees set id=?,first=?,last=?, age=? where id=120";
			PreparedStatement st = Con.prepareStatement(sql);
			st.setInt(1, 120);
            st.setString(2, "why");
            st.setString(3, "because");
            st.setInt(4, 350);
		   int result =st.executeUpdate();

			System.out.println(String.valueOf(result));

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}

	}

	public static void insertdata() throws ClassNotFoundException, SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc." + "Driver");
			String url = "jdbc:mysql://localhost/EMP?useSSL=false";
			Connection Con = DriverManager.getConnection(url, "root", "");
			String sql = "insert into employees(id,first,last,age) values(?,?,?,?)";
			PreparedStatement st = Con.prepareStatement(sql);
			st.setInt(1, 120);
            st.setString(2, "hello");
            st.setString(3, "bye");
            st.setInt(4, 35);
		   int result =st.executeUpdate();

			System.out.println(String.valueOf(result));

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}

	}
}
