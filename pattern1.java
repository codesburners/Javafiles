public class pattern1 {
    public static void main(String[] args)
    {
        int count=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i+j>5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            for(int k=1;k<=5;k++)
            {
                if(i==1)
                {
                    System.out.print(" ");
                }
                else if(i>=k){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
        for(int m=1;m<=5;m++)
        {
            for(int l=1;l<=5;l++)
            {
                 if(l>=m)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            for(int n=1;n<=5;n++)
            {
                if(m==5)
                {
                    System.out.print(" ");
                }

                else if(m+n>5) {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }

    }
}
