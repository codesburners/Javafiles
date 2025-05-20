import java.util.*;
public class patt4 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=s1.nextLine();
        System.out.println("String is: "+str);
        String new_str=str.replaceAll("[aeiouAEIOU]","^");
        int len=new_str.length();
        System.out.println("Length of the string after removing vowels is: "+len);
        System.out.println("The new string is: "+new_str);
    }
}
