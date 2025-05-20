import java.util.Scanner;
public class re_prac2 {
    public static void main(String[] args)
    {
       Scanner s1=new Scanner(System.in);
       String str=s1.nextLine();
         System.out.println(str.matches("[0-9][A-F]*"));
         String d=s1.nextLine();
            System.out.println(d.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
    }

}
