import java.util.*;
public class re_prac {
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        int a=s1.nextInt();
        String str=" ";
        str=str.valueOf(a);
        System.out.println(str.matches("[0-1]*"));

    }

}
