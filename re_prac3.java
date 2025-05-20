import java.util.*;
public class re_prac3 {
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        String str=s1.nextLine();
        /*
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));

         */

        String words[]=str.split("\\s+");
        System.out.println(words.length);
    }
}
