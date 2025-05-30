import java.util.*;

public class prime1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number to check prime or not:");
        int n = s1.nextInt();

        long startTime = System.nanoTime();  // Start timing

        if (n <= 1) {
            System.out.println("Not prime");
            return;
        }

        int i = 2;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                System.out.println("Not prime");
                return;
            }
            i++;
        }

        System.out.println("Prime");

        long endTime = System.nanoTime();  // End timing

        System.out.println("Execution time: " + (endTime - startTime) + " ns");
    }
}
