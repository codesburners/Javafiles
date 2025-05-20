public class array1 {
    public static void main(String[] args)
    {
        int a[]=new int[10];
        int b[]={1,2,3,4,5};
        int c[];
        c=new int[5];
        b[2]=15;
        for(int i=0;i<=b.length-1;i++)
        {
            System.out.println(b[i]++);
        }
        for(int x:b)
        {
            System.out.println(x++);
        }
    }
}
