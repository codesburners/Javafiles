import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) {
        int port = 9876;
        byte[] receiveData = new byte[1024];
        
        try (DatagramSocket serverSocket = new DatagramSocket(port);
             FileOutputStream fos = new FileOutputStream("received_image.png")) {
            
            System.out.println("Server is listening on port " + port);
            
            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);
                
                String receivedString = new String(receivePacket.getData(), 0, receivePacket.getLength());
                if (receivedString.equals("END")) {
                    System.out.println("File transfer complete.");
                    break;
                }
                
                fos.write(receivePacket.getData(), 0, receivePacket.getLength());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
