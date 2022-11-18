package com.jspiders.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbclogic {
	static Connection connection;
	static PreparedStatement preparedStatement;
	static Statement statement;
	static int resultInt;
	static ResultSet resultset;
	static String driverpath = "com.mysql.cj.jdbc.Driver";
	static String dbpath = "jdbc:mysql://local host:3306/weje1";
	static String user="root";
	static Scanner sc = new Scanner(System.in);
	static String query; 
	static String password = "root";
	
	public static void startMethod() {
		try {
			Class.forName(driverpath);
			
			connection = DriverManager.getConnection(dbpath);
			
			statement = connection.createStatement();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void endMethod() {
		query = "select * from emp";
		try {
			preparedStatement  = connection.prepareStatement(query);
			while(resultset.next()) {
				System.out.println(resultset.getString(1)+"|"+resultset.getString(2)+"|"+resultset.getString(3)+"|"+resultset.getString(4)+"|"+resultset.getString(5)+"|"+resultset.getString(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void addsongs() {
		jdbclogic.startMethod();
		query = "select * from emp";
		
		int value= sc.nextInt();
		System.out.println("Enter in which index we have to add the song");
		int index = sc.nextInt();
		System.out.println("entr the values in the project");
		String names = sc.next();
		try {
			preparedStatement = connection.prepareStatement(query);
			resultset = preparedStatement.executeQuery();
			query  = "insert into"
					+ "values(?,?,?,?,?,?)";
			preparedStatement.setInt(index , value);
			preparedStatement.setString(index, names);
			preparedStatement.setString(index, names);
			preparedStatement.setString(index, names);
			preparedStatement.setString(index, names);
			preparedStatement.setInt(index , value);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void playAllSongs() {
		jdbclogic.startMethod();
		query = "select * from emp";
		try {
			resultset = statement.executeQuery(query);
			for(int i=0;i<resultset.getFetchSize();i++) {
				System.out.println(resultset.getString(i)+" :song is playing");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void playRandomSongs() {
		jdbclogic.startMethod();
		query = "select * from emp";
		try {
			resultset = statement.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void removeSong() {
		jdbclogic.startMethod();
		int index = sc.nextInt();
		int value = sc.nextInt();
		query = "delete from playlist"
				+ "where id = ? ";
		try {
			preparedStatement.setInt(index, value);
			preparedStatement = connection.prepareStatement(query);
			resultInt = preparedStatement.executeUpdate();
			System.out.println("Query ok "+resultInt+" row(S) affected");
			jdbclogic.endMethod();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void updateSong() {
		jdbclogic.startMethod();
		int value = sc.nextInt();
		int index = sc.nextInt();
		String sname = sc.next();
		query = "update playlist "
				+ "set sname = ?"
				+ "where id = ?";
		try {
			preparedStatement.setInt(index, value);
			preparedStatement.setString(index, sname);
			preparedStatement = connection.prepareStatement(query);
			resultInt = preparedStatement.executeUpdate();
			System.out.println("Query ok "+resultInt+" row(S) affected");
			jdbclogic.endMethod();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		System.out.println("select the following options: ");
		System.out.println("1. add songs \n2. play song \n3.Edit song");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}
}
