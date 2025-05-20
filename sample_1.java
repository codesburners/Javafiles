import java.net.*;
import java.io.*;
import java.util.*;
public class sample_1 {
    public static void main(String[] args) {
        try{
            DatagramSocket socket =new DatagramSocket();
            int number=99;
            byte[] buffer =String.valueOf(number).getBytes();
            InetAddress address=InetAddress.getLocalHost();
            DatagramPacket sendPacket=new DatagramPacket(buffer,buffer.length,address,5000);
            socket.send(sendPacket);
            // receive from the server or receiver
            byte [] buffer1=new byte[1024];
            DatagramPacket receivepacket=new DatagramPacket(buffer1,buffer1.length);
            socket.receive(receivepacket);
            String str=new String(receivepacket.getData());
            System.out.println("The received data is: "+str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
