import java.util.*;
public class patt1 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=s1.nextLine();
        String reg="p[q]*";
        System.out.println("String matches the pattern: "+str.matches(reg));

    }
}
