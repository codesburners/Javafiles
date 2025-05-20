class parent
{
     parent()
    {
        System.out.println("Non parametrized constructor of child");

    }
    parent(int x){
         System.out.println("Parametrized constructor of parent"+x);
    }
}
class child extends parent{
    child(){
        System.out.println("Non param child");

    }
    child(int x)
    {
        System.out.println("Param child");
    }
    child(int x ,int y){
        super(x);
        System.out.println("Param child 2:"+y);
    }
}
public class Inheritance3 {
    public static void main(String[] args) {
        child c1=new child(95,82);
    }
}
