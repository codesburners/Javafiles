import java.util.*;
public class arm {
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=s1.nextInt();
        int N=n;
        int sum=0,r;
        while(n>0)
        {
            r=n%10;
            sum =sum+(int)Math.pow(r,3);
            n=n/10;

        }
        System.out.println(sum);
        if(sum==N)
        {
            System.out.println("The given number is armstrong number");

        }
        else{
            System.out.println("The given number is not an armstrong number");
        }
    }
}
