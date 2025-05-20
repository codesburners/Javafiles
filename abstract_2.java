abstract class Shape{
    abstract double perimeter();
    abstract double area();
}
class circles1 extends Shape{
    public double radius;
    public  circles1(double  radius){
        this.radius=radius;
    }
    @Override
   public double  perimeter()
    {
        return 2*Math.PI*radius;
    }
    @Override
    public double area()
    {
        return Math.PI*radius*radius;
    }

}
class Rectangles extends Shape{
    public double length;
    public double breadth;

    public Rectangles(double length,double breadth)
    {
        super();
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    @Override
    public double area()
    {
        return length*breadth;
    }
}
public class abstract_2 {
    public static void main(String[] args) {
        circles1 c1=new circles1(7);
        System.out.println("Area"+c1.area());
        System.out.println("Perimeter"+c1.perimeter());
        Rectangles r1=new Rectangles(10,20);
        System.out.println("Area: "+r1.area());
        System.out.println("Perimeter: "+r1.perimeter());

    }
}
