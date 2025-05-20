import java.util.*;
public class prac6 {
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5};
        int b[]=new int[2*a.length];
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }
        for(int x:a)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        for(int x:b){
            System.out.print(x+" ");
    }
    }

}
