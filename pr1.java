import java.util.*;
public class pr1 {
    public int maxScore(String s) {
        String ch=s;
        int max=0;
        for(int i=1;i<ch.length();i++)
        {
            String right=ch.substring(i);
            String left=ch.substring(0,i);
            int rightzero=0;
            int leftzero=0;
            for(int j=0;j<right.length();j++)
            {
                if(right.charAt(j)=='1')
                {
                    rightzero++;
                }
            }
            for(int k=0;k<left.length();k++)
            {
                if(left.charAt(k)=='0')
                {
                    leftzero++;
                }
            }
            int tot=leftzero+rightzero;
            if(tot>max)
            {
                max=tot;

            }
        }
        return max;

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s1=new Scanner(System.in);
        String s=s1.nextLine();
        pr1 c1=new pr1();

        System.out.println(c1.maxScore(s));

    }
}
