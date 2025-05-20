public class param3 {
    void max(int a[]){
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("The maximum element is "+max);
    }
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5};
        param3 p1=new param3();
        p1.max(a);
    }
}
