import java.util.*;
public class s1 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int num1=s1.nextInt();
        int num2=s1.nextInt();
        int num3=s1.nextInt();
        int angle1=num1+num2;
        int angle2=num1+num3;
        int angle3=num2+num3;
        if(angle1==angle2 && angle2==angle3)
        {
            System.out.println("equilateral");
        }
        else if(angle1==angle2 || angle1==angle3||angle2==angle3)
        {
            System.out.println("isosceles");
        }
        else if(angle1!=angle2 && angle1!=angle3 && angle2!=angle3)
        {
            System.out.println("scalene");
        }
    }
}
