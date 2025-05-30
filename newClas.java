
class Outer1{
    static int x=10;
    int y=20;
    static class My {
        public void show() {
            System.out.println("x: " + x);
            // Cannot access non-static variable y from static context
            // System.out.println("y: " + y);
        }
    }

}
public class newClas {
    public static void main(String[] args) {
        Outer1.My outer = new Outer1.My();
        outer.show();

    }
}
