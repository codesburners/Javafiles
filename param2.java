import java.util.Scanner;
public class param2 {
    void gcd(int m,int n)
    {
        while(m!=n)
        {
            if(m>n){
                m=m-n;
            }
            else{
                n=n-m;
            }
        }
        if(m==n)
        {
            System.out.println("GCD is: "+m);
        }
    }
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter m: ");
        int m=s1.nextInt();
        System.out.println("Enter n: ");
        int n=s1.nextInt();
        param2 g1=new param2();
        g1.gcd(m,n);
    }

}
