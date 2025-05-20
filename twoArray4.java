import java.util.*;
public class twoArray4 {
    public static void main(String[] args)
    {

        String arr[]={ "hello","world","java","python","c++"};
        String str1[]=new String[arr.length];
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
             str1[i]=arr[i];
        }
        for(String x:arr)
        {
            System.out.println(x);
        }
        

    }
}
