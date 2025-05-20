public class ar2 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        System.out.println("Sum of array elements: " + sum);
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=10;j++)
            {
                System.out.print("-"+" ");
            }
            System.out.println(" ");
        }
    }
}
