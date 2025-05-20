import java.util.Scanner;
public class dig_in_words {
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=s1.nextInt();
        int N=n;
        String rev=new String();
        while(n>0)
        {
            int r=n%10;
            rev=rev+r;
            n=n/10;


        }
        System.out.println(rev);
        char c;
        for(int i=rev.length()-1;i>=0;i--)
        {
            c= rev.charAt(i);
            switch (c)
            {
                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;
            }
        }

    }
}
