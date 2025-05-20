import java.util.*;
public class checksum {
    public static String calculateChecksum(String[] binaryWords) {
        int sum = 0;

        // Step 1: Convert each 16-bit binary word to integer and add
        for (String word : binaryWords) {
            sum += Integer.parseInt(word, 2);

            // If carry occurs (more than 16 bits), wrap it
            if ((sum & 0xFFFF0000) != 0) {
                sum = (sum & 0xFFFF) + 1;
            }
        }

        // Step 2: One's complement of the result
        int checksum = ~sum & 0xFFFF;

        // Step 3: Convert back to 16-bit binary string
        return String.format("%16s", Integer.toBinaryString(checksum)).replace(' ', '0');
    }
    public static void main(String[] args) {
        String[] header = {
                "0100010100000000", // Version + IHL + Type of Service
                "0000000000111100", // Total Length
                "0001110001000110", // Identification
                "0100000000000000", // Flags + Fragment offset
                "0100000000000110", // TTL + Protocol
                "0000000000000000", // Checksum (initially 0)
                "1100000010101000", // Source IP (first half)
                "0000000100000010", // Source IP (second half)
                "1100000010101000", // Destination IP (first half)
                "0000000100000001"  // Destination IP (second half)
        };

        String checksum = calculateChecksum(header);
        System.out.println("IPv4 Header Checksum (binary): " + checksum);

    }
}
