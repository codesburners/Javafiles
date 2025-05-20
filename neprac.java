public class neprac {
    public static void main(String[] args) {
        String str="011101";
        int max=0;

        for(int i=0;i<=str.length();i++)
        {
            String left=str.substring(0,i);
            String right=str.substring(i);
            int leftzero=0;
            int rightzero=0;
            for(int j=0;j<left.length();j++)
            {
                if(left.charAt(j)=='0')
                {
                    leftzero++;
                }
            }
           for(int k=0;k<right.length();k++)
            {
                if(right.charAt(k)=='1')
                {
                    rightzero++;
                }
            }
            int tot=leftzero+rightzero;
            if(tot>max){
                max=tot;
                System.out.println(tot);
            }
        }

        System.out.println(max);
    }
}
