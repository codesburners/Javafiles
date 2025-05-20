import java.util.*;
public class prac {
    public static void main(String args[])
    {
        int a[] ={1,2,3,4,5};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];

        }
        System.out.println("Sum of array elements is:"+sum);
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=s1.nextInt();
        for(int j=1;j<=n;j++)
        {
            if(n==a[j])
            {
                System.out.println("Element found at position:"+j);
                break;
            }
            else{
                System.out.println("Element not found");
                break;
            }
        }
        int max=a[0];
        for(int k=0;k<a.length;k++)
        {
            if(a[k]>max){
                max=a[k];
            }
            else{
                continue;
            }
        }
        System.out.println("Maximum element in the array is:"+max);
        int max1,max2;
        max1=max2=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max1)
            {
                max2=max1;
                max1=a[i];

            }
            else if(a[i]>max)
            {
                max2=a[i];
            }
        }
        System.out.println("Second maximum element in the array is:"+max2);

    }

}
