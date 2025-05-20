import java.util.*;
public class overloading2 {
    int reverse(int n)
    {
        int rev=0;
        while (n>0)
        {

            int r=n%10;
            rev=rev*10+r;
            n=n/10;

        }
        return rev;
    }
    void reverse(int a[])
    {
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+"\t");
        }
    }

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        overloading2 obj=new overloading2();
        System.out.println("Enter the type of an operation : ");
        String type=s1.next();
        switch(type)
        {
            case "int":
                System.out.println("Enter the number: ");
                int n=s1.nextInt();
                System.out.println("Reversed integer number is "+obj.reverse(n));
                break;
            case "array":
                int a[]=new int[5];
                System.out.println("Enter the number");
                for(int i=0;i<a.length;i++)
                {
                    a[i]=s1.nextInt();

                }
                obj.reverse(a);
        }
    }

}
