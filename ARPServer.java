import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.HashMap;

public class ARPServer {
    public static void main(String[] args) {
        final int PORT = 9876;

        // Simulated ARP table (IP to MAC mapping)
        HashMap<String, String> arpTable = new HashMap<>();
        arpTable.put("192.168.1.1", "AA:BB:CC:DD:EE:01");
        arpTable.put("192.168.1.2", "AA:BB:CC:DD:EE:02");
        arpTable.put("192.168.1.3", "AA:BB:CC:DD:EE:03");
        arpTable.put("AA:BB:CC:DD:EE:01", "192.168.1.1");
        arpTable.put("AA:BB:CC:DD:EE:02", "192.168.1.2");
        arpTable.put("AA:BB:CC:DD:EE:03", "192.168.1.3");

        try (DatagramSocket serverSocket = new DatagramSocket(PORT)) {
            System.out.println("ARP Server is running...");

            byte[] receiveBuffer = new byte[1024];
            byte[] sendBuffer;

            while (true) {
                // Receive request
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                serverSocket.receive(receivePacket);
                String receivedData = new String(receivePacket.getData(), 0, receivePacket.getLength());

                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

                System.out.println("Received request for: " + receivedData);

                // Find corresponding address
                String response = arpTable.getOrDefault(receivedData, "Address not found");
                sendBuffer = response.getBytes();

                // Send response
                DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, clientAddress, clientPort);
                serverSocket.send(sendPacket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
