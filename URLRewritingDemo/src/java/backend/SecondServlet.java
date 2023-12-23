package backend;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        HttpSession session = req.getSession();
        
        String newurl=resp.encodeURL("FirstServlet");
        out.print(newurl+"<br> <br>");
        
        out.print("Second Servlet<br> <br>");
        out.print("<a href='"+newurl+"'>Click here to go to 1st servlet </a>");
        
    }
}