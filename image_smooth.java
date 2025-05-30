import java.util.*;
public class image_smooth {
    public static void main(String[] args) {
        int a[][]=new int[3][3];
        Scanner s1=new Scanner(System.in);
        for(int i=0;i<=3;i++)
        {
            for(int j=0;j<=3;j++)
            {
                a[i][j]=s1.nextInt();
            }
        }
        int res1=(a[0][0]+a[0][2]+a[2][0]+a[2][2])/4;
        int res2=(a[0][1]+a[1][0]+a[1][2]+a[2][1])/4;
        for(int i=0;i<=3;i++)
        {
            for(int j=0;j<=3;j++)
            {
                if(i==0 && j==0)
                {
                    System.out.print(res1+" ");
                }
                else if(i==0 && j==1)
                {
                    System.out.print(res2+" ");
                }
                else if(i==0 && j==2)
                {
                    System.out.print(res1+" ");
                }
                else if(i==1 && j==0)
                {
                    System.out.print(res2+" ");
                }
                else if(i==1 && j==1)
                {
                    System.out.print(a[i][j]+" ");
                }
                else if(i==1 && j==2)
                {
                    System.out.print(res2+" ");
                }
                else if(i==2 && j==0)
                {
                    System.out.print(res1+" ");
                }
                else if(i==2 && j==1)
                {
                    System.out.print(res2+" ");
                }
                else if(i==2 && j==2)
                {
                    System.out.print(res1+" ");
                }
            }
        }
    }
}
