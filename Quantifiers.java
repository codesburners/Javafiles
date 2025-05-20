import java.util.*;
public class Quantifiers {
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the gmail");
        String gmail=s1.nextLine();
        int i=gmail.indexOf('@');
        String uname=gmail.substring(0,i);
        String domain=gmail.substring(i+1,gmail.length());
        System.out.println("Username: "+uname);
        System.out.println("Domain: "+domain);
        if(domain.startsWith("gmail"))
        {
            System.out.println("Valid gmail Domain");
        }
        else
        {
            System.out.println("Invalid Domain");
        }

        String rep=uname.replaceAll("[a-zA-Z0-9]","*");
        System.out.println("Replaced: "+rep+"@"+domain);

    }
}
