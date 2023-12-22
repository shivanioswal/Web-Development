package com.learn;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import java.io.*;
import javax.servlet.http.*;
public class FirstServlet extends HttpServlet 
{
		private static final long serialVersionUID = 1L;
		//we will learn how to get value from cookie

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
		{
			resp.setContentType("text/html");
			//PrintWriter out=resp.getWriter();
			
			int val=0;
			
			Cookie ck[]=req.getCookies();
			for(Cookie c:ck)
			{
				//out.println(c.getName()+" : "+c.getValue());
				
				if(c.getName().equals("status"))
				{
					val=1;
				}
			}
			if(val==1)
			{
				resp.sendRedirect("profile");
			}
			else
			{
				resp.sendRedirect("login.html");
			}
		}
}
