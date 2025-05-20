public class varArg1 {
    int max(int ...x)
    {
        if(x.length==0)
        {return Integer.MIN_VALUE;}
        else{
            int max=x[0];
            for(int i=1;i<x.length;i++)
            {
                if(x[i]>max)
                {
                    max=x[i];
                }

            }
            return max;
        }

    }

    public static void main(String[] args) {
        varArg1 obj=new varArg1();
        System.out.println(obj.max(10,15,36,45,56));
    }

}
