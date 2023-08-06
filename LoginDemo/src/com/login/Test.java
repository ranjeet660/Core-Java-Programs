package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Test {

	public static Student studentLogin(String username, String password) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/velocity", "root", "Ranjeet@123");
			PreparedStatement ps = con.prepareStatement("select uname, pass from student where uname = ? and pass=?");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			Student student = new Student();
			while(rs.next()) {
				student.setUsername(rs.getString(1));
				student.setPassword(rs.getString(2));
				
			}
			if(username.equals(student.getUsername()) && password.equals(student.getPassword())){
				System.out.println("Login Successfull...!");
			}else {
				System.out.println("Check Your Username and Password");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public static void DBStudent(Student student) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/velocity", "root", "Ranjeet@123");
			PreparedStatement ps = con.prepareStatement("insert into student (id, name,uname,pass) values(?,?,?,?)");
			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setString(3, student.getUsername());
			ps.setString(4, student.getPassword());
			
			ps.executeUpdate();
			System.out.println("Inserted succefully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void log(int no) {
		Scanner scanner = new Scanner(System.in);
		switch (no) {
		case 1:
			System.out.println("Enter id");
			int sid=scanner.nextInt();
			System.out.println("Enter name");
			String name= scanner.next();
			System.out.println("Enter Username");
			String uname = scanner.next();
			System.out.println("Enter Password");
			String pass = scanner.next();
			
			Student student = new Student();
			student.setId(sid);
			student.setName(name);
			student.setUsername(uname);
			student.setPassword(pass);
			DBStudent(student);
			break;
			
		case 2:
			
			System.out.println("Enter Username");		
			String username = scanner.next();
			System.out.println("Enter Password");
			String password = scanner.next();
			studentLogin(username, password);
			break;

		default:
			break;
		}
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1) Student register");
		System.out.println("2) For Login enter details");
		System.out.println("Enter your choice");
		int no = scanner.nextInt();
		log(no);
		
	}
}
