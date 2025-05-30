import java.util.*;
public class count_sort1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max=0;
        int n = scanner.nextInt();
        scanner.nextLine();
        String[][] arr = new String[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = scanner.next();
            arr[i][1] = scanner.next();
            int num=Integer.parseInt(arr[i][0]);
            if(num>max){
                max=num;
            }
        }
        int[] count=new int[max+1];
        for(int i=0;i<n;i++){
            int num=Integer.parseInt(arr[i][0]);
            count[num]++;
        }
        for(int i=1;i<count.length;i++)
        {
            count[i]+=count[i-1];
        }
        String[] b=new String[n];
        for(int i=n-1;i>=0;i--)
        {
            int num=Integer.parseInt(arr[i][0]);
            String value=(i<n/2) ? "-" : arr[i][1];
            int pos=--count[num];
            b[pos]=value;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(b[i]);
        }


    }
}
