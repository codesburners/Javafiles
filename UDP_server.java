import java.net.*;
import java.io.*;
import java.util.Scanner;
public class UDP_server {
    public static void main(String[] args) {
        try{
             DatagramSocket socket =new DatagramSocket(5000);
             byte [] buffer=new byte[1024];
             DatagramPacket receivepacket=new DatagramPacket(buffer,buffer.length);
             socket.receive(receivepacket);
             String data=new String(receivepacket.getData());
             int number=Integer.parseInt(data.trim());
             int res=number*number;
             byte[] senddata=String.valueOf(res).getBytes();
             InetAddress address=InetAddress.getLocalHost();
             DatagramPacket sendPacket=new DatagramPacket(senddata,senddata.length,address,5000);
             socket.send(sendPacket);
             socket.close();
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }
}
