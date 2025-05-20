public class twoArray2 {
    public static void main(String[] args)
    {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][ ]={{2,4,6},{8,10,12},{14,16,18}};
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                System.out.print(a[i][j]+b[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }

}
