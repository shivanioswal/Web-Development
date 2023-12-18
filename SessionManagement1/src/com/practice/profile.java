package com.practice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.http.*;
public class profile extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			resp.setContentType("text/html");
			PrintWriter out =resp.getWriter();
			
			HttpSession session = req.getSession();
			String name =(String)session.getAttribute("session_name");
			
			
			out.println("<html>");
			out.println("<head>");
			out.println("</head>");
			out.println("<body>");
			out.println("Welcome :"+name);
			out.println("<a href ='Logout'> Logout <a>");
			out.println("</body>");
			out.println("</html>");
			
			
			
			

	}
	

}
