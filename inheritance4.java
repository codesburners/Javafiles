class Rectangle1{
    int length;
    int breadth;
    int x=10;
    Rectangle1(int length,int breadth){
        this.length=length;//LHS=data members, RHS=parameters
        this.breadth=breadth;
    }
    void display()
    {
        System.out.println("THe length="+length);
        System.out.println("The breadth="+breadth);
    }
}
class cuboid extends Rectangle1{
    int height;
    int x=20;
    cuboid(int l,int b,int h){
        super(l,b);
        this.height=h;
    }
    void display(){
        System.out.println("Length->"+length);
        System.out.println("breath->"+breadth);
        System.out.println("Parent x->"+super.x);
        System.out.println("Height->"+height);
        System.out.println("Child x->"+this.x);
    }
}
public class inheritance4 {
    public static void main(String[] args) {
        cuboid r1=new cuboid(10,20,30);
        r1.display();
    }

}
