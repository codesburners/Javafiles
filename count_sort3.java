public class count_sort3 {
    public void count_sort(int arr[]) {
        int max=0;
        for(int num:arr)
        {
            if(num>max)
            {
                max=num;
            }
        }
        int[] count=new int[max+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        for(int i=1;i<count.length;i++)
        {
            count[i]+=count[i-1];
        }
        int b[] =new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            b[--count[arr[i]]]=arr[i];

        }
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }

    }

        public static void main (String[]args){
            int arr[] = {2, 1, 1, 0, 2, 5, 4, 0, 2, 8, 7, 7, 9, 2, 0, 1, 9};
            count_sort3 c=new count_sort3();
            c.count_sort(arr);
        }
    }
