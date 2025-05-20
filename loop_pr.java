import java.util.*;
public class loop_pr {
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=s1.nextInt();
        int N=n;
        for(int i=1;i<=10;i++)
        {
            System.out.println(N+"x"+i+"="+(N*i));
        }

    }
}
