package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name2 = request.getParameter("name1");
		String email2 = request.getParameter("email1");
		String pass2 = request.getParameter("pass1");
		String phoneno2 = request.getParameter("phoneno1");
		String gender2 = request.getParameter("gender1");
		
		out.print("Values Inserted Successfully");
		out.print("Name: "+name2);
		out.print("Email: "+email2);
		out.print("Password: "+pass2);
		out.print("Gender: "+gender2);
		out.print("Phone no: "+phoneno2);
		
		
		
	}

}
