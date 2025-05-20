import java.util.*;
public class patt2 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        String str=s1.nextLine();
        String reg="[a-z]+_[a-z]+$";
        System.out.println(str.matches(reg));
    }
}
