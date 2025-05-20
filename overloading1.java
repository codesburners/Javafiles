import java.util.*;
public class overloading1 {

    double area(double l,double b)
    {
        double a=l*b;
        return a;
    }
    double area(double r)
    {
        double a=Math.PI*r*r;
        return a;

    }
    double area(double a,double b,double h){
        double ar=1/2*(a+b)*h;
        return ar;

    }

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        overloading1 obj=new overloading1();
        System.out.println("1.Rectangle");
        System.out.println("2.Circle");
        System.out.println("3.Trapezium\n");
        String num=s1.nextLine();
        switch (num)
        {
            case "Rectangle":
                System.out.println("Enter the breadth");
                double b=s1.nextDouble();
                System.out.println("Enter the Height");
                double h=s1.nextDouble();
                System.out.println("The area of the rectangle is "+obj.area(b,h));
                break;
            case "Circle":
                System.out.println("Enter the radius");
                double r=s1.nextInt();
                System.out.println("The area of the circle is "+obj.area(r));
                break;
            case "Trapezium":
                System.out.println("Enter the area");
                double a=s1.nextDouble();
                System.out.println("Enter the breadth");
                double b1=s1.nextDouble();
                System.out.println("Enter the height");
                double h1=s1.nextDouble();
                System.out.println("The area of the trapezium is "+obj.area(a,b1,h1));
        }
    }


}
