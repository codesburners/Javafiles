import java.net.*;
import java.io.*;
import java.util.*;
public class client {
    public static void main(String[] args) {
        try{
            Socket client =new Socket("localhost",5000);
            System.out.println("Connected to server");
            BufferedReader br= new BufferedReader(new InputStreamReader(client.getInputStream()));
            //read data from server
            while(true){
                String data=br.readLine();
                System.out.println("Data from client"+data);
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
