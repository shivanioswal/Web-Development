package sendmaildemo;

public class SendMailDemo {

    public static void main(String[] args) 
    {
        try
        {
            TestSendMail.sendmail("to_email@gmail.com");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
