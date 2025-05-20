interface Test1{
    void meth1();
    void meth2();
}
class Test2 implements Test1{
    @Override
    public void meth1()
    {
        System.out.println("Method 1 of Test2");
    }
    @Override
    public void meth2()
    {
        System.out.println("Method 2 of Test2");
    }
    public void meth3()
    {
        System.out.println("Method 3");
    }

}
public class Interface1 {
    public static void main(String[] args) {
        Test1 t=new Test2();
        t.meth1();
        t.meth2();
       // t.meth3();   error because parent class doesn't have meth3() method
    }
}
