package com.practice;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.*;
import javax.servlet.http.*;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
	{
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String uemail=req.getParameter("email1");
		String upass=req.getParameter("pass1");
		
		if(uemail.equals("dummy@gmail.com") && upass.equals("dummy123"))
		{
			HttpSession session = req.getSession();
			//get the name from database
			String name="dummy";
			session.setAttribute("email1", "dummygmail.com");
			session.setAttribute("pass1", "dummy123");
			session.setAttribute("session_name", name);
			
			resp.sendRedirect("profile");
		}
		else
		{
			out.print("Login Error");
		}
	}

}
