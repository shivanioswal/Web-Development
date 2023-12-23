package com.annotations;

import java.io.IOException;
import java.io.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebInitParam;

@WebServlet(
		name="Fifth servlet" ,
		urlPatterns= {"/Fifthser1","/Fifthser2","/Fifthser3","/Fifthser4"} ,
		initParams = {
				@WebInitParam(name="company", value="dummy123"),
				@WebInitParam(name="email",value="dummy@gmail.com")
		}
		)
public class FifthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		out.println("Hello World");
		
		ServletConfig config = getServletConfig();
		out.print(config.getInitParameter("company"));
		out.print(config.getInitParameter("email"));
		
	}

}
