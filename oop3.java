class cylinder{
    public double radius;
    public double height;
    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
    public double totalSurfaceArea()
    {
        return 2*lidArea()+2*Math.PI*radius*height;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double volume()
    {
        return lidArea()*height;
    }
}
public class oop3 {
    public static void main(String[] args) {
        cylinder c1=new cylinder();
        c1.radius=10;
        c1.height=10;
        System.out.println("Lid Area: "+c1.lidArea());
        System.out.println("Total Surface Area: "+c1.totalSurfaceArea());
        System.out.println("Perimeter: "+c1.perimeter());
        System.out.println("Volume: "+c1.volume());
    }

}
