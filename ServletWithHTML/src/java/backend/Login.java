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
        
        String expectedemail = req.getParameter("email1");
        String expectedpassword = req.getParameter("pass1");
        
        String expectedemailID = "dummy@gmail.com";
        String expectedpasswordUser = "dummy123" ;
        
        if(expectedemail.equals(expectedemailID) && expectedpassword.equals(expectedpasswordUser))
        {
            out.print("Login Successful");
        }
        else
        {
            out.print("Login Failed");
        }
    }
    
}
