public class varArg2 {
    void sum(@org.jetbrains.annotations.NotNull int ...a)
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];

        }
        System.out.println(sum);

    }


    public static void main(String[] args) {
        varArg2 obj=new varArg2();
        obj.sum(10,10,10,10,10,10);
    }


}
