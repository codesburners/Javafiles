import java.util.*;
public class fib2 {
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=s1.nextInt();
        int a=0,b=1,c=0;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=0;i<n;i++)
        {

            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }

}
