package backend;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        
        HttpSession session = req.getSession();
        
        String newurl=resp.encodeURL("SecondServlet");
        out.print(newurl+"<br> <br>");
                
        
        out.print("First Servlet <br> <br>");
        out.print("<a href='"+newurl+"'>Click here to go to 2nd servlet </a>");
        //Here newurl put so that it understands that it is the same session (which means the same person) even if cookies are blocked
    }
}