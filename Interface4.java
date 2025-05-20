interface test{
    int x=10;
    abstract void meth1();
    private  void meth2(){
        System.out.println("Method 2");
    }
    default  void meth3()
    {
        System.out.println("Method 3");
    }
}
class test2 implements test{
    public void meth1(){};
    public void meth2(){};
}
public class Interface4 {
    public static void main(String[] args) {
        System.out.println(test.x);
        test t1=new test2();
        t1.meth3();
    }
}
