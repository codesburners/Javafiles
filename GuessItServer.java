import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Random;

    public class GuessItServer {
        public static void main(String[] args) {
            final int PORT = 9876;
            try (DatagramSocket serverSocket = new DatagramSocket(PORT)) {
                System.out.println("Server is running... Waiting for client...");

                byte[] receiveBuffer = new byte[1024];
                byte[] sendBuffer;

                // Generate the magic number between 1 and 99
                Random random = new Random();
                int magicNumber = random.nextInt(99) + 1;
                System.out.println("Magic Number (for debugging): " + magicNumber);

                int attempts = 0;
                InetAddress clientAddress = null;
                int clientPort = 0;

                while (attempts < 10) {
                    // Receive client's guess
                    DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                    serverSocket.receive(receivePacket);
                    String receivedData = new String(receivePacket.getData(), 0, receivePacket.getLength());

                    clientAddress = receivePacket.getAddress();
                    clientPort = receivePacket.getPort();

                    int guess;
                    try {
                        guess = Integer.parseInt(receivedData.trim());
                    } catch (NumberFormatException e) {
                        sendBuffer = "Invalid input. Please enter a number.".getBytes();
                        serverSocket.send(new DatagramPacket(sendBuffer, sendBuffer.length, clientAddress, clientPort));
                        continue;
                    }

                    attempts++;

                    // Compare the guess with the magic number
                    if (guess == magicNumber) {
                        sendBuffer = "Great! You guessed it right.".getBytes();
                        serverSocket.send(new DatagramPacket(sendBuffer, sendBuffer.length, clientAddress, clientPort));
                        break;
                    } else if (guess < magicNumber) {
                        sendBuffer = "Higher".getBytes();
                    } else {
                        sendBuffer = "Lower".getBytes();
                    }

                    serverSocket.send(new DatagramPacket(sendBuffer, sendBuffer.length, clientAddress, clientPort));
                }

                if (attempts == 10) {
                    sendBuffer = ("Better luck next time :) The number was " + magicNumber).getBytes();
                    serverSocket.send(new DatagramPacket(sendBuffer, sendBuffer.length, clientAddress, clientPort));
                }

                System.out.println("Game over. Server shutting down.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


