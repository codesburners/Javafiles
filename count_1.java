import java.util.*;
public class count_1 {
    public static void main(String[] args)
    {
        System.out.println("Enter the number: ");
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }



        System.out.println("Number of digits in the given number is:"+count);
    }

}
