class rec{
    private double length;
    private double breadth=10;
    public double getLength()
    {
        return length;
    }
    public void setLength(double l)
    {
        length=l;
    }
    public double area()
    {
        return length*breadth;
    }
}
public class datahiding_1 {
    public static void main(String[] args) {
        rec r1=new rec();
        r1.setLength(10);
        System.out.println("The length:"+r1.getLength());
        System.out.println("The area:"+r1.area());
    }
}
