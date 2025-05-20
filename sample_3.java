import java.net.*;
import java.util.*;
import java.io.*;
public class sample_3 {
    public static void main(String[] args) {
        try{
            Socket client =new Socket("localhost",5000);
            System.out.println("System connected");
            Scanner s1=new Scanner(System.in);
            PrintWriter p1=new PrintWriter(client.getOutputStream());
            while(true)
            {
                System.out.println("Enter the sum_n_numbers");
                int n=s1.nextInt();
                p1.println(n);
                p1.flush();
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
