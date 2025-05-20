import java.lang.reflect.Array;
import java.util.*;
public class ar1 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the number array");
        int a[]=new int[5];

        String b[]=new String[5];
        for(int i=0;i<=a.length;i++)
        {
            a[i]=s1.nextInt();
        }
        System.out.println("Enter the string array");
        for(int i=0;i<=a.length;i++)
        {
            b[i]=s1.nextLine();
        }
        System.out.println("Entered number array"+Arrays.toString(a));
        System.out.println("Entered string array"+Arrays.toString(b));
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println("Sorted number array"+Arrays.toString(a));
        System.out.println("Sorted string array"+Arrays.toString(b));
    }
}
