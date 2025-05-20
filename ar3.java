public class ar3 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,5,6,7,7,8,10};
        for(int i=a.length-1;i>0;i--)
        {
            if(a[i]==a[i-1])
            {
                System.out.println("Duplicate found--->"+a[i]);
            }
        }

    }
}
