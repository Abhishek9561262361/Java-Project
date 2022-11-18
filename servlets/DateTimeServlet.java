package com.jspiders.servlets.servletclass;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateTimeServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException  , IOException{
		
		resp.setContentType("text/html");
		PrintWriter write = resp.getWriter();
		resp.setHeader("refresh", "1");
		Date date = new Date();
		write.println("<h1>"+date+"<h1>");
	}
	
}
