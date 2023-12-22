package com.learn;

import java.io.IOException;
import javax.servlet.http.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logout extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
//we will learn how to delete cookie
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		Cookie[] ck=req.getCookies();
		for(Cookie c:ck)
		{
			c.setMaxAge(0);
			resp.addCookie(c);
		}
		
		resp.sendRedirect("login.html");
	}
	
	

}
