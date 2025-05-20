import java.util.*;
public class digits {
    public static void main(String[] args){
        System.out.print("Enter the number: ");
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        int sum=0,r;
        while(n>0){
            r=n%10;
            n=n/10;
            System.out.println("r is:"+r);
            sum=sum+r;

        }





        System.out.println("Sum of digits is:"+sum);
    }
}
