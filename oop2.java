class rectangle{
    public double length;
    public double breadth;
    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    public boolean isSquare()
    {
        if(length==breadth) return true;
        else return false;
    }


}
public class oop2 {
    public static void main(String[] args) {
        rectangle r1=new rectangle();
        r1.length=10;
        r1.breadth=10;
        System.out.println("Area: "+r1.area());
        System.out.println("Perimeter: "+r1.perimeter());
        System.out.println("Result: "+r1.isSquare());
    }
}
