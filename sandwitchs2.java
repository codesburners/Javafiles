import java.util.*;
class Sandwhichs2 {

    public static int studentEat(int  [] studentsArr, int[] sandwichesArr) {
        int countSquareSandwitchStudents = 0;
        int countCircleSandwitchStudents = 0;
        int countSquareSandwitches = 0;
        int countCircleSandwitches = 0;

        for (int i: studentsArr) {
            if (i == 1) {
                countSquareSandwitchStudents++;
            } else {
                countCircleSandwitchStudents++;
            }
        }

        for (int i: sandwichesArr) {
            if (i == 1) {
                countSquareSandwitches++;
            } else {
                countCircleSandwitches++;
            }
        }

        if(countSquareSandwitchStudents > countSquareSandwitches) {
            return countSquareSandwitchStudents - countSquareSandwitches;
        }

        if(countCircleSandwitchStudents  > countCircleSandwitches) {
            return countCircleSandwitchStudents - countCircleSandwitches;
        }

        return 0;
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

        System.out.println(studentEat(students, sandwiches));
    }
}

