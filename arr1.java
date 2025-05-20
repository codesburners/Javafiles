public class arr1 {
    public static void main(String[] args) {
        int a[] =new int[10];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        int n=5;
        int pos=3;
        int new_val=99;
        for(int i=n;i>pos;i--)
        {
            a[i]=a[i-1];

        }

        a[pos]=new_val;
        int len=a.length;
        for(int i=0;i<n+1;i++)
        {

            System.out.print(a[i]);
        }
        System.out.println("");
        for(int i=pos;i<n;i++)
        {
            a[i]=a[i+1];
        }
        for(int i=0;i<n;i++)
        {

            System.out.print(a[i]);
        }

    }
}
