import java.util.*;
public class pa2 {
    public static void main(String[] args) {
       Scanner s1=new Scanner(System.in);
       int sum=0;
       int n=s1.nextInt();
       int a[] =new int[n];
       int result[]=new int[n];
       for(int i=0;i<a.length;i++)
       {
           a[i]=s1.nextInt();
       }
       int k=s1.nextInt();
       for(int i=1;i<k;i++)
       {
           if(k>0)
           {
               for(int j=0;j<=k;j++)
               {
                   int index=(i+j)%n;
                   sum+=a[index];
               }
           }

               result[i]=sum;
       }
    }
}
