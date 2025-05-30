class static_block1 {
    static {
        System.out.println("Static block executed");
        // You can add more initialization code here if neede
    }
        static
        {
            System.out.println("Another static block executed");
        }
    }

public class static_block {

    public static void main(String[] args) {
        static_block1 obj = new static_block1();
        System.out.println("Main method executed");
        // You can add more code here to test the static block
    }


}
