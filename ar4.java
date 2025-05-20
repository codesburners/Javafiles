public class ar4 {
    public static void main(String[] args) {
        String b[]={"a","b","c","d","e","f","c","b","a","d"};
        for(int i=b.length-1;i>0;i--)
        {
            for(int j=i+1;j<b.length;j++)
            {
                if(b[i].equals(b[j])&&(i!=j))
                {
                    System.out.println("Duplicate element is: " + b[i]+" at index " + i + " and " + j);

                }
            }
        }
    }
}
