import java.util.*;
public class practise_2 {
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=s1.nextInt();
        int mul=1;
        for(int i=1;i<=n;i++){
            mul=mul*i;

        }
        System.out.println("Factoral of the given numebr is:"+mul);
    }
}
