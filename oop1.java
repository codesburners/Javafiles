class circles{
    public double radius;
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
}
public class oop1 {
    public static void main(String[] args) {
        circle c1=new circle();
        c1.radius=7;
        System.out.println("Area"+c1.area());
        System.out.println("Perimeter"+c1.perimeter());
    }
}
