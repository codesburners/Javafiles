public class prc9 {

    static void change(int a[],int index,int value)
    {
        a[index]=value;
    }
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4,5};
        change( a, 2, 15);
        for(int x:a)
        {
            System.out.println(x);
        }
    }

}
