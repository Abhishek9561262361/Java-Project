package com.jspiders.servlets.servletclass;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

//import com.jspiders.servletpath.EmployeeRegistration;
import com.jspiders.servletpath.Student_details;

public class student_details {
	static Student_details student_details;
	static Connection connection;
	static PreparedStatement preparedStatement;
	static ResultSet resultSet;
	static FileReader fileReader;
	static Properties properties = new Properties();
	static int resulInt;
	static String query;
//	static String filepath = "D:\\weje1\\jdbc\\resource\\db_info.properties";
	
	public static void main(String[] args) {
		
		connection = null;
		preparedStatement = null;
		query = "insert into employee.employee1 values(?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("loaded Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje1?user=root&password=root");
			System.out.println("Established Connection");
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, Student_details.sid);
			preparedStatement.setString(1, Student_details.firstName);
			preparedStatement.setString(1, Student_details.lastName);
			preparedStatement.setString(1, Student_details.Email);
			preparedStatement.setString(1, Student_details.PhoneNumber);
			preparedStatement.setString(1, Student_details.Gender);
			preparedStatement.setString(1, student_details.Subjects);
			preparedStatement.executeUpdate();
			System.out.println("data added");
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(preparedStatement != null) {
				try {
					preparedStatement.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if(connection != null) {
				try {
					connection.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
