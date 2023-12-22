package com.learn;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;

public class LoginService extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//we will learn how to create cookie
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String email2=req.getParameter("email1");
		String pass2=req.getParameter("pass1");
		String remember2=req.getParameter("remember1");
		
		if(email2.equals("dummy@gmail.com") && pass2.equals("dummy123"))
		{
			if(compare(remember2, "selected"))
			{
				Cookie ck1=new Cookie("username", email2);
				ck1.setMaxAge(60*60*24*365);
				resp.addCookie(ck1);
				
				Cookie ck2=new Cookie("status", "true");
				ck2.setMaxAge(60*60*24*365);
				resp.addCookie(ck2);
			}
			resp.sendRedirect("profile");
		}
		else
		{
			out.println("Email id and Password didnt matched");
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.include(req, resp);
		}
	}
	
	public static boolean compare(String str1, String str2)
	{
		return (str1==null ? str2==null : str1.equals(str2));
	}
}
