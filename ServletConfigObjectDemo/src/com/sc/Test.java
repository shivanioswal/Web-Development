package com.sc;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletException;
import java.io.*;
import javax.servlet.ServletConfig;


public class Test extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		ServletConfig config = getServletConfig();
		String expectedemail=config.getInitParameter("email");
		
		out.print(expectedemail);
		
		
	}

}
