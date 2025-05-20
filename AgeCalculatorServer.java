import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculatorServer {
    public static void main(String[] args) {
        final int PORT = 9876;

        try (DatagramSocket serverSocket = new DatagramSocket(PORT)) {
            System.out.println("Age Calculation Server is running...");

            byte[] receiveBuffer = new byte[1024];
            byte[] sendBuffer;

            while (true) {
                // Receive client's DOB input
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                serverSocket.receive(receivePacket);
                String receivedData = new String(receivePacket.getData(), 0, receivePacket.getLength());

                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

                System.out.println("Received DOB: " + receivedData);

                // Split the received data into year, month, and day
                String[] dobParts = receivedData.split("/");
                if (dobParts.length != 3) {
                    sendBuffer = "Invalid format! Use DD/MM/YYYY.".getBytes();
                } else {
                    try {
                        int day = Integer.parseInt(dobParts[0]);
                        int month = Integer.parseInt(dobParts[1]);
                        int year = Integer.parseInt(dobParts[2]);

                        // Get today's date
                        LocalDate today = LocalDate.now();
                        LocalDate birthDate = LocalDate.of(year, month, day);
                        Period age = Period.between(birthDate, today);

                        String response = "Your age is: " + age.getYears() + " years, " +
                                age.getMonths() + " months, and " + age.getDays() + " days.";
                        sendBuffer = response.getBytes();
                    } catch (Exception e) {
                        sendBuffer = "Error in processing date. Check format!".getBytes();
                    }
                }

                // Send the calculated age back to the client
                DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, clientAddress, clientPort);
                serverSocket.send(sendPacket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
