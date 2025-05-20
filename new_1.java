public class new_1 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=5;j++)
            {
                if(i==2&&j==2||i==2&&j==3) {
                    System.out.print("  ");
                }
                else if(i==3&&j==2||i==3&&j==3) {
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }


            }
            System.out.println();
        }
    }
}
