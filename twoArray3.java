public class twoArray3 {
    public static void main(String[] args)
    {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,0,0},{0,1,0},{0,0,1}};
        int c[][]=new int[a.length][b.length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++){
                c[i][j]=0;
                for(int k=0;k<b.length;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
