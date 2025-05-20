import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.*;
import java.io.*;
import java.util.*;
public class UDP_client1 {
        public static void main(String[] args) {
            try{
                DatagramSocket socket=new DatagramSocket();
                System.out.println("Enter the number to send to server:");
                Scanner S1=new Scanner(System.in);
                int number=S1.nextInt();
                byte[] buffer=String.valueOf(number).getBytes();
                InetAddress address=InetAddress.getLocalHost();
                DatagramPacket sendPacket=new DatagramPacket(buffer,buffer.length,address,5000);
                socket.send(sendPacket);

                byte[] newBuffer=new byte[1024];
                DatagramPacket receivePacket=new DatagramPacket(newBuffer,newBuffer.length);
                socket.receive(receivePacket);
                String result =new String(receivePacket.getData()).trim();
                System.out.println("The result from server is: "+result);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
