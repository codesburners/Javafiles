public class pattern2 {
    public static void main(String[] args)
    {
            for(int i=1;i<=5;i++)
            {
                for(int k=1;k<=5;k++)
                {
                    if(i==5)
                    {
                        System.out.print(" ");
                    }

                    else if(i+k>5) {
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

/*

 for(int m=1;m<=5;m++)
        {
        for(int l=1;l<=5;l++)
        {
        if(m==1)
        {
        System.out.print(" ");
                }
                        else if(l>=m)
        {
        System.out.print("*");
                }
                        else{
                        System.out.print(" ");
                }

                        }
                        System.out.println();
        }
        *
 */