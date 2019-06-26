package com.evan.database;
import java.sql.SQLException;
import java.util.Scanner;
public class StudentEntry {

	public static void main(String[] args) {
		student s= new student();
		@SuppressWarnings("resource")
		Scanner scan= new Scanner(System.in);
		System.out.println("enter student name");
		s.studentname=scan.next();
		System.out.println("enter student roll");
		s.roll=scan.next();
		System.out.println("enter student grade");
		s.grade=scan.next();
		StudentDao dao= new StudentDao();
		try {
			dao.insertstudent(s);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
