package com.myfilters;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.*;

public class ValidationFilters implements Filter
{
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name2 = request.getParameter("name1");
		String email2 = request.getParameter("email1");
		String pass2 = request.getParameter("pass1");
		String phoneno2 = request.getParameter("phoneno1");
		String gender2 = request.getParameter("gender1");
		
		String name_error_msg="";
		String email_error_msg="";
		String password_error_msg="";
		String gender_error_msg="";
		String phno_error_msg="";
		
		boolean val=true;
		
		if(name2==null || name2.equals(""))
		{
			name_error_msg="Name cannot be empty";
			val=false;
		}
		if(email2==null || email2.equals(""))
		{
			email_error_msg="Email cannot be empty";
			val=false;
		}
		if(pass2==null || pass2.equals(""))
		{
			password_error_msg="Password cannot be empty";
			val=false;
		}
		if(phoneno2==null || phoneno2.equals(""))
		{
			gender_error_msg="PhoneNo cannot be empty";
			val=false;
		}
		if(gender2==null || gender2.equals(""))
		{
			phno_error_msg="Gender cannot be empty";
			val=false;
		}
		
		if(val==true)
		{
			chain.doFilter(request, response);
		}
		else
		{
			out.println(name_error_msg);
			out.println(email_error_msg);
			out.println(password_error_msg);
			out.println(gender_error_msg);
			out.println(phno_error_msg);
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
		
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	
}
