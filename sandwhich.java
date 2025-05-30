import java.util.*;
class Sandwhich{
     public static int studentEat(int  [] studentsArr, int[] sandwichesArr){
         Queue<Integer> students = new LinkedList<>();
         for(int student:studentsArr)
         {
             students.add(student);
         }
         Queue<Integer> sandwiches = new LinkedList<>();
         for (int sandwich : sandwichesArr) {
             sandwiches.add(sandwich);
         }
         int rotations=0;
         while(!students.isEmpty() && rotations<students.size()){
             int student=students.peek();
             int sandwich=sandwiches.peek();
             if(student==sandwich)
             {
                 students.poll();
                 sandwiches.poll();
                 rotations=0;

             }
             else{
                 students.add(students.poll());
                 rotations++;
             }

         }

         return students.size();
     }
    public static void main(String[] args) {
         Scanner s1=new Scanner(System.in);
         int n=s1.nextInt();
        int[] students = new int[n];
        int[] sandwiches = new int[n];

        int unableToEat = studentEat(students, sandwiches);
        System.out.println(unableToEat);
    }
}

