import java.util.Scanner;

public class prac3 {
    public static void main(String[] args)
    {

        int a[]=new int[10];
        a[0]=10;
        a[1]=30;
        a[2]=40;
        a[3]=50;
        a[4]=60;
        a[5]=70;
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter the index: ");
        int n=s1.nextInt();
        int temp=a[n];
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        for(int i=n;i<a.length-1;i++)
        {
            a[i]=a[i+1];
        }
        System.out.println();
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }

}
