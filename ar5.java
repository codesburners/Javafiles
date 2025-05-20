public class ar5 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,5,6,7,7,8,10};
        int unique=a.length;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    a[j]=a[unique-1];
                    unique--;
                    j--;

                }
            }


        }
        for(int k=0;k<unique;k++)
        {
            System.out.print(a[k]+" ");
        }
    }
}
