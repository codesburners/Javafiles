import java.net.*;
import java.io.*;
import java.util.*;
public class server{
    public static void main(String[] args) {
        try{
            ServerSocket ss=new ServerSocket(5000);
            System.out.println("Waiting for client...");
            Socket server=ss.accept();
            System.out.println("Client connected");
            //send data from server to client;
            Scanner s1=new Scanner(System.in);
            PrintWriter pw=new PrintWriter(server.getOutputStream());
            while(true){
                System.out.println("Enter the data to send to client:");
                String data=s1.nextLine();
                pw.println(data);
                pw.flush();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
