class Supers{
    public void meth1()
    {
        System.out.println("Super1");
    }
    public void meth2(){
        System.out.println("Super2");
    }
}
class Subs extends Supers{
    @Override
    public void meth2()
    {
        System.out.println("Sub2");
    }
    public void meth3()
    {
        System.out.println("Sub3");
    }

}public class OverrideRules {
    public static void main(String[] args) {
        Subs s=new Subs();
        s.meth1();
        s.meth2();
    }
}
