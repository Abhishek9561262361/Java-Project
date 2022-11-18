package com.jspiders.servletpath;

//import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class EmployeeJdbcLogic {
	
	static Connection connection;
	static EmployeeRegistration employeeRegistration;
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
			preparedStatement.setString(1, EmployeeRegistration.id);
			preparedStatement.setString(1, EmployeeRegistration.firstName);
			preparedStatement.setString(1, EmployeeRegistration.lastName);
			preparedStatement.setString(1, EmployeeRegistration.Email);
			preparedStatement.setString(1, EmployeeRegistration.PhoneNumber);
			preparedStatement.setString(1, EmployeeRegistration.Gender);
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
