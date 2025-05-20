import java.util.*;
public class prac5 {
    public static void main(String[] args){
        int a[]=new int[5];
        int b[]=new int[5];
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        for(int i=0;i<5;i++)
        {
            a[i]=s1.nextInt();

        }
        System.out.println("The original elements are:");
        for(int i=0;i<5;i++)
        {
            System.out.println("index"+i+"->"+a[i]);
        }
        System.out.println("The copy elements are");
        for(int i=0;i<5;i++)
        {
            b[i]=a[i];
        }
        for(int i=b.length-1;i>=0;i--)
        {
            System.out.println("index"+i+"->"+b[i]);
        }
    }
}
