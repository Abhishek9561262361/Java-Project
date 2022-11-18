package com.jspiders.servlets.servletclass;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet1 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServerException , IOException  {
	
		resp.setContentType("text/html");
		PrintWriter write =  resp.getWriter();
		write.println("<h1> This is my firsr servlets <h1>");
	}
}
