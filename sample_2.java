import java.net.*;
import java.io.*;
import java.util.*;
public class sample_2 {
    public static void main(String[] args) {
        try{
             ServerSocket socket =new ServerSocket(5000);
             System.out.println("waiting for connection0");
             Socket server=socket.accept();
             System.out.println("Socket connected");
             BufferedReader buffer=new BufferedReader(new InputStreamReader(server.getInputStream()));
             while(true){
                 String data=buffer.readLine();
                 System.out.println("The data from the server is"+data);
             }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
