import java.util.*;
public class param1 {
    void prime(int x )
    {
        for(int i=2;i<=x/2;i++)
        {
            if(x%i==0)
            {
                System.out.println("Not a prime number");


            }

        }
        System.out.println(" Prime number");
    }
    public static void main(String[] args)
    {

        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=s1.nextInt();;
        param1 p1=new param1();;
        p1.prime(a);
    }

}
