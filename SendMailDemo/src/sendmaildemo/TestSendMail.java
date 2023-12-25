package sendmaildemo;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class TestSendMail 
{
    public static void sendmail(String to_email) throws Exception
    {
        Properties props = new  Properties();
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.port","587");
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.starttls.enable","true");
        
        String from_email="xxxxx@gmail.com";
        String from_email_pass="xxxxx";
        
        Session session=Session.getInstance(props, new Authenticator()
        {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from_email, from_email_pass);
            }
            
        });
        
        Message message=prepareMessage(session,from_email ,to_email);
        Transport.send(message);
        System.out.println("Message sent successfully");
     }
    
    private static Message prepareMessage(Session session , String from_email,String to_email)throws Exception
    {
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from_email));
        message.setRecipients(Message.RecipientType.TO, to_email);
        message.setSubject("hello");
        message.setText("This is my first mail demo message....");
        return message;
    }
}
