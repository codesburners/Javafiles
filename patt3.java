import java.util.*;
public class patt3 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the Strings");
        String s=s1.nextLine();
        String reg="p.*q$";
        System.out.println(s.matches(reg));

    }
}
