import java.util.Scanner;
public class fib1 {
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=s1.nextInt();
        System.out.println("Enter r: ");
        int r=s1.nextInt();
        System.out.println("Enter n: ");
        int n=s1.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println(a);
            a=a*r;
        }
    }

}
