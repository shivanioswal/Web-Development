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
        
        String email = req.getParameter("email1");
        String password = req.getParameter("pass1");
        
        String expectedemail = "dummy@gmail.com";
        String expectedpassword = "dummy123" ;
        
        if(email.equals(expectedemail) && password.equals(expectedpassword))
        {
            out.print("Login Successful");
        }
        else
        {
            out.print("Login Failed");
        }
    }
    
}
