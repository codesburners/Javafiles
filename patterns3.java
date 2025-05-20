public class patterns3 {
    public static void main(String[] args) {

        for (int i = 0; i <=5; i++) {
            for (int j = 0; j <=5; j++) {
                if (j == 0 || j == 5 || i == 0 || i == 5) {
                    System.out.print("* ");
                } else if (i == 1 || i == 4 || j == 1 || j == 4) {
                    System.out.print("* ");
                }
                else if(i == 1 && j == 4 || i == 4 && j == 1) {
                    System.out.print("* ");
                }
                else if (i == 2 && j == 1 || i == 3 && j == 4) {
                    System.out.print("* ");
                }
                else if (i == 3 && j == 1 || i == 2 && j == 4) {
                    System.out.print("* ");
                }

                else {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }

    }
}

