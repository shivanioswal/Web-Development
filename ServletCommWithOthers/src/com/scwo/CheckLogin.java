package com.scwo;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletException;
import java.io.*;
import javax.servlet.RequestDispatcher;


public class CheckLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPOST(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
	{
		//resp.setContentType("text/html");
		//PrintWriter out= resp.getWriter();
		
		String useremail = req.getParameter("email1");
		String userpass = req.getParameter("pass1");
		
		if(useremail.equals("deepak@gmail.com") && userpass.equals("deepak123"))
				{
					RequestDispatcher rd = req.getRequestDispatcher("profile.html");
					rd.forward(req,resp);
				}
		else
		{
			RequestDispatcher rd = req.getRequestDispatcher("loginerror.html");
			rd.forward(req,resp);
		}
		
		
	}
	

}