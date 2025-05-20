class Super1{
    public void meth1()
    {
        System.out.println("Super1");
    }
    public void meth2(){
        System.out.println("Super2");
    }
}
class SubC extends Super1{
    @Override
    public void meth2()
    {
        System.out.println("Sub2");
    }
    public void meth3()
    {
        System.out.println("Sub3");
    }

}
public class Dynamic_method_dispatch {
    public static void main(String[] args) {

        SubC s1=new SubC();
        s1.meth2();
        s1.meth3();
        Super1 s2=new SubC();
        s2.meth1();
        s2.meth2();
        /*s2.meth3();*/
    }
}
