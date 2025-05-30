
import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class sandwitches3temp {

    public static int countStudents(int[] studentsArr, int[] sandwichesArr) {
        Queue<Integer> students = new LinkedList<>();
        for (int student : studentsArr) {
            students.add(student);
        }

        int index = 0; // index for sandwiches
        int rotations = 0;

        while (!students.isEmpty() && rotations < students.size()) {
            if (students.peek() == sandwichesArr[index]) {
                students.poll();   // student takes the sandwich
                index++;           // move to next sandwich
                rotations = 0;     // reset rotation count
            } else {
                students.add(students.poll());  // move student to end of queue
                rotations++; // count a failed attempt
            }
        }

        return students.size();  // students left are unable to eat
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // length of arrays

        int[] students = new int[n];
        int[] sandwiches = new int[n];

        for (int i = 0; i < n; i++) {
            students[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sandwiches[i] = sc.nextInt();
        }

        System.out.println(countStudents(students, sandwiches));
    }
}