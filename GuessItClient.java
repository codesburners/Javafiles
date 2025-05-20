import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class GuessItClient {
    public static void main(String[] args) {
        final String SERVER_ADDRESS = "localhost";
        final int SERVER_PORT = 9876;
        try (DatagramSocket clientSocket = new DatagramSocket();
             Scanner scanner = new Scanner(System.in)) {

            InetAddress serverAddress = InetAddress.getByName(SERVER_ADDRESS);
            byte[] sendBuffer;
            byte[] receiveBuffer = new byte[1024];

            System.out.println("Welcome to the 'Guess It' game!");
            System.out.println("Try to guess the magic number between 1 and 99. You have 10 attempts.");

            for (int i = 0; i < 10; i++) {
                System.out.print("Enter your guess: ");
                String userGuess = scanner.nextLine();

                // Send guess to server
                sendBuffer = userGuess.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, serverAddress, SERVER_PORT);
                clientSocket.send(sendPacket);

                // Receive response from server
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                clientSocket.receive(receivePacket);

                String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Server: " + response);

                if (response.startsWith("Great") || response.startsWith("Better luck")) {
                    break;
                }
            }

            System.out.println("Game over. Thank you for playing!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
