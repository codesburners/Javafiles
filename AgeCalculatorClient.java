import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class AgeCalculatorClient {
    public static void main(String[] args) {
        final String SERVER_ADDRESS = "localhost";
        final int SERVER_PORT = 9876;

        try (DatagramSocket clientSocket = new DatagramSocket();
             Scanner scanner = new Scanner(System.in)) {

            InetAddress serverAddress = InetAddress.getByName(SERVER_ADDRESS);
            byte[] sendBuffer;
            byte[] receiveBuffer = new byte[1024];

            System.out.println("Age Calculator Client");
            System.out.print("Enter your Date of Birth (DD/MM/YYYY): ");
            String dob = scanner.nextLine();

            // Send DOB to server
            sendBuffer = dob.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, serverAddress, SERVER_PORT);
            clientSocket.send(sendPacket);

            // Receive the calculated age from the server
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            clientSocket.receive(receivePacket);

            String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Server Response: " + response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
