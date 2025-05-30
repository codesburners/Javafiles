
class Outer{
    int x=10;
    class Inner1{
        int y=20;
        void Innerdisplay()
        {
            System.out.println("x: " + x);
            System.out.println("y: " + y);

        }
    }
    void OuterDisplay()
    {
        Inner1 i1 = new Inner1();
        i1.Innerdisplay();
        System.out.println(i1.y);
    }
}
public class Inner {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.OuterDisplay();
        Outer.Inner1 oi=new Outer().new Inner1();
        oi.Innerdisplay();
    }
}
