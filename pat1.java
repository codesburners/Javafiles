import java.util.*;
public class pat1 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
      String str=s1.nextLine();
      char ch=s1.next().charAt(0);
      int index=str.indexOf(ch);
      if(index==-1)
      {
          System.out.println("Not Found");
      }
      else
      {
          String str1=new StringBuilder(str.substring(0,index+1)).reverse().toString();
          String res=str1+str.substring(index+1);
          System.out.println(res);
      }
    }
}
