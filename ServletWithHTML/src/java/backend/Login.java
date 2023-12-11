package backend;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.*;

public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        
        String email2 = req.getParameter("email1");
        String pass2 = req.getParameter("pass1");
        
        if(email2.equals("deepak@gmail.com") && pass2.equals("deepak123"))
        {
            out.print("Login Successful");
        }
        else
        {
            out.print("Login Failed");
        }
    }
    
}
