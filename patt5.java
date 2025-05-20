import java.util.*;
public class patt5 {
    public static void main(String[] args) {
        int count=0;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=s1.nextLine();
        String reg="[aeiouAEIOU]";

        for(int i=0;i<s.length();i++)
        {
            String ch=String.valueOf(s.charAt(i));;
            if(ch.matches(reg))
            {
                count++;
            }

        }
        System.out.println(count);
    }
}
