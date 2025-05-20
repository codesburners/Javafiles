import java.util.*;
public class pal {
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        int m=n;
        int rev=0;
        while(n>0){
            int r=n%10;
            rev=rev*10+r;
            n=n/10;

        }
        if(rev==m){
            System.out.println("The given number is palindrome");

        }
        else System.out.println("The given number is not a palindrome");
    }

}
