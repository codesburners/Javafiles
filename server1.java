import java.net.*;
import java.io.*;
import java.util.*;
public class server1 {
    public static void main(String[] args) {
        try{
            ServerSocket ss=new ServerSocket(5000);
            System.out.println("Server is ready to accept connection");
            Socket server=ss.accept();
            System.out.println("Server connected");
            BufferedReader bf=new BufferedReader(new InputStreamReader(server.getInputStream()));
            while(true){
                String data=bf.readLine();
                if(data.equals("Gowtham"))
                {
                    System.out.println("Hello Gowtham");
                }
                if(data.equals("exit"))
                {
                    ss.close();
                }
                System.out.println("The data from client is--->"+data);
                System.out.println("The length of the data is "+data.length());
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
