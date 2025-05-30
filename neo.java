import java.util.*;
public class neo {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=s1.nextInt();
        System.out.println("Enter the number of columns:");
        int m=s1.nextInt();
        String resArr=" ";
        String[][] arr=new String[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=s1.next();
            }
        }
        for(int j=0;j<m;j++)
        {
            for(int i=0;i<n;i++)
            {
                resArr=resArr+arr[i][j]+" ";
            }
        }
        String res=resArr.replaceAll("(?<=[A-Za-z0-9])[^A-Za-z0-9]+(?=[A-Za-z0-9])" , " ");
        System.out.println(res);

    }
}
