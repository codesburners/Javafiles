import java.util.*;
public class matrix_script {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int m=s1.nextInt();
        int n=s1.nextInt();
        String a[]=new String[m+n];
        String a1="";
        String a2="";
        String a3="";
        for(int i=0;i<a.length;i++)
        {
            a[i]=s1.nextLine();
           a1=a1+a[i].charAt(i);
           i++;
           a2= a2+a[i].charAt(i);
              i++;
              a3= a3+a[i].charAt(i);
              i++;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i].charAt(i)+" ");
        }
    }
}
