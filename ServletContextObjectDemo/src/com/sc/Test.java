package com.sc;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.ServletContext;


public class Test extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		ServletContext context = getServletContext();
		 
		 String name1 = context.getInitParameter("name");
		 out.println(name1);
		 
		 
		 
	}

}
