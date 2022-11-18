package com.jspiders.servletpath;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Student_details
 */
@WebServlet("/Student_details")
public class Student_details extends HttpServlet {
	public static String sid;
	public static String firstName;
	public static String lastName;
	public static String Email;
	public static String PhoneNumber;
	public static String Gender;
	public String Subjects;

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Student_details() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		sid = request.getParameter("sid");
		firstName = request.getParameter("firstname");
		lastName = request.getParameter("lastname");
		Email = request.getParameter("email");
		PhoneNumber = request.getParameter("phonenumber");
		Gender = request.getParameter("gender");
		String[] Subjects =request.getParameterValues("subjects");
		writer.println("Your subjects are: <br>");
		for(String str:Subjects) {
			writer.println(str+ " <br>");
			System.out.println("<html><body><h1> Student Details are: /n Name: " +firstName+ " " +lastName + "/n <br> /n Email :" +Email+ "/n Phone_number: "+PhoneNumber+" /n Gender: "+Gender+"/n Subjects are: "+str);
			System.out.close();
		}
//		System.out.println("<html><body><h1> Student Details are: /n Name: " +firstName+ " " +lastName + "/n <br> /n Email :" +Email+ "/n Phone_number: "+PhoneNumber+" /n Gender: "+Gender+"/n Subjects are: "+Subject);
//		System.out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
