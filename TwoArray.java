public class TwoArray {
    public static void main(String[] args)
    {
        int a[][]=new int[5][5];
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        int c[][];
        c = new int[5][5];
        for(int x[]:b)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
        //Jagged Array
        int d[][];
        d=new int[3][];
        d[0]=new int[3];
        d[1]=new int[4];
        d[2]=new int[5];
        for(int i=0;i<d.length;i++)
        {
            for(int j=0;j<d[i].length;j++)
            {
                System.out.print(d[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
