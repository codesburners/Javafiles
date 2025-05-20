import java.util.*;
class student{
    public int roll_num;
    public String name;
    public String course;
    int m1,m2,m3;
    public int total()
    {
        return m1+m2+m3;
    }
    public double average()
    {
        return (m1+m2+m3)/3;
    }
    public void grade(){
        if(average()>=60)
        {
            System.out.println("First class");
        }
        else if(average()>=50)
        {
            System.out.println("Second class");
        }
        else if(average()>=40)
        {
            System.out.println("Third class");
        }
        else{
            System.out.println("Fail");
        }
    }
}
public class oop4 {
    public static void main(String[] args) {
        student obj=new student();
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the roll number: ");
        int roll_num=s1.nextInt();
        System.out.println("Enter the name: ");
        String name=s1.next();
        System.out.println("Enter the course: ");
        String course=s1.next();
        System.out.println("Enter the marks: ");
        int m1=s1.nextInt();
        int m2=s1.nextInt();
        int m3=s1.nextInt();
        obj.roll_num=roll_num;
        obj.name=name;
        obj.course=course;
        obj.m1=m1;
        obj.m2=m2;
        obj.m3=m3;
        System.out.println("Name: "+obj.name);
        System.out.println("Roll number: "+obj.roll_num);
        System.out.println("Course: "+obj.course);
        System.out.println("Total marks:"+obj.total());
        System.out.println("Average marks: "+obj.average());
        obj.grade();

    }
}
