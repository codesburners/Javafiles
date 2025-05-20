interface Member{
    void callback();
}
class customers implements Member{
    String name;
    customers(String n)
    {
        name=n;
    }
    @Override
    public void callback()
    {
        System.out.println("Ok I will call you back "+name);
    }
}
class store{
    Member mem[]=new Member[100];
    int count=0;
    void register(Member m)
    {
        mem[count++]=m;
    }
    void inviteSale()
    {
        for(int i=0;i<count;i++)
        {
            mem[i].callback();
        }
    }
}
public class Interface3 {
    public static void main(String[] args) {
        store s=new store();
        customers c1=new customers("John");
        customers c2=new customers("Mary");
        customers c3=new customers("Tom");
        s.register(c1);
        s.register(c2);
        s.register(c3);
        s.inviteSale();
    }
}
