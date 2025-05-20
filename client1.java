import java.net.*;
import java.io.*;
import java.util.*;
public class client1 {
    public static void main(String[] args) {
        try{
            Socket client =new Socket("localhost",5000);
            System.out.println("Connected to server");
            Scanner s1=new Scanner(System.in);
            PrintWriter pw=new PrintWriter(client.getOutputStream());
            while(true)
            {
                System.out.println("Enter the data to send to server:");
                String data=s1.nextLine();
                pw.println(data);
                pw.flush();
                System.out.println("Data sent to server");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
