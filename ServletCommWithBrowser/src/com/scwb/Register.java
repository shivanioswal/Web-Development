package com.scwb;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletException;
import java.io.*;


public class Register extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		resp.setContentType("text/html");
		PrintWriter out= resp.getWriter();
		
		String name=req.getParameter("name1");
		String email=req.getParameter("email1");
		String password=req.getParameter("pass1");
		String gender=req.getParameter("gender1");
		String[] language=req.getParameterValues("lang1");
		String city=req.getParameter("city1");
		
		out.print("Name:  "+name);
		out.print("email:  "+email);
		out.print("password:  "+password);
		out.print("gender:  "+gender);
		for(int i=0;i<language.length; i++)
		{
			out.print(language[i]);
		}
		out.print("city:  "+city);
		
		
		
	}

}
