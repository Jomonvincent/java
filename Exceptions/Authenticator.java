package Exceptions;
import java.util.*;
class AuthenticateException extends Exception
{
    public AuthenticateException(String message)
    {
        super(message);
    }
}
public class Authenticator
{   
    public static void Authenticate(String username,String password) throws AuthenticateException
    {
        if(!username.equals("admin") || !password.equals("password123"))
        {
            throw new AuthenticateException("Invalid username or password");
        }
    }
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Entet username : ");
        String uname=obj.nextLine();
        System.out.print("Enter password : ");
        String pass=obj.nextLine();
        try{
            Authenticate(uname,pass);
            System.err.println("Login successfull");
        }catch(AuthenticateException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            obj.close();
        }
    }
}