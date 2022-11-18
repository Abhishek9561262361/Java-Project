package com.jspiders.servletpath;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmploeeRegistration
 */
@WebServlet("/Employee")
public class EmployeeRegistration extends HttpServlet {
	static String id;
	static String firstName ;
	static String lastName;
	static String Email;
	static String PhoneNumber;
	static String Gender;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.setContentType("text/html");
//		PrintWriter writer = response.getWriter();
		 id = request.getParameter("eid");
		 firstName = request.getParameter("firstname");
		 lastName = request.getParameter("lastname");
		 Email = request.getParameter("email");
		 PhoneNumber = request.getParameter("phonenumber");
		 Gender = request.getParameter("gender");
//		writer.println("welcome "+firstName+" "+lastName+ "<br>");
//		writer.println("Email "+Email+ "<br>" );
//		writer.println("PhoneNumber "+PhoneNumber+ "<br>" );
//		writer.println("Gender "+Gender+ "<br>" );
		System.out.println("<html><body><h1>Employee Details are: /n name: "+firstName+" Last name: "+lastName+"/n"
				+ "/n Email: "+Email+"/n phone number: "+PhoneNumber+" /n gender: "+Gender);
		System.out.close();
	}

}
