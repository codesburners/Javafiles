import java.util.*;
public class fib {
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=s1.nextInt();
        System.out.println("Enter d: ");
        int d=s1.nextInt();
        System.out.println("Enter n: ");
        int n=s1.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print(a);
            a=a+d;
        }
    }
}
