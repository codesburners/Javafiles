 abstract class Supers1{
    public Supers1(){
        System.out.println("Super class constructor");
    }
    public void meth1()
    {
        System.out.println("Method of Supers1");
    }
    abstract public void meth2();
}
class Subs1 extends Supers1 {
    public Subs1() {
        System.out.println("Sub class constructor");
    }
@Override
    public void meth2() {
        System.out.println("Method of Subs1");
    }
}
public class abstarct_1 {
    public static void main(String[] args) {
        Subs1 s1=new Subs1();
        s1.meth1();
        s1.meth2();

    }
}
