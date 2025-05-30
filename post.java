import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class post {
    private static String range="^[1-9][0-9]{5}$";
    private static String rep="(\\d)(?=(\\d\\1))";
    boolean check(@NotNull String str){
        int count=0;
        boolean range_checker=str.matches(range);
        Pattern p=Pattern.compile(rep);
        Matcher m=p.matcher(str);
        while(m.find()){
            count++;
        }
        return range_checker && count <  2;

    }
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        String str=s1.nextLine();
        post p=new post();
        System.out.println(p.check(str));
    }
}
