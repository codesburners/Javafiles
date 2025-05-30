import java.lang.reflect.Array;
import java.util.*;
public class binary {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        Integer[] arr=new Integer[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s1.nextInt();
        }
        Arrays.sort(arr,new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                int binaryA=Integer.bitCount(a);
                int binaryB=Integer.bitCount(b);
                    if(binaryA != binaryB) {
                        return binaryA - binaryB; // Sort by number of 1s in descending order
                    } else {
                        return a - b; // If equal, sort by value in ascending order
                    }
            }
        });
        for(int num:arr){
            System.out.print(num + " ");
        }

    }
}
