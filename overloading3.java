import java.util.*;
public class overloading3 {
    boolean validate(String name)
    {
        return name.matches("[a-zA-Z]*");
    }
    boolean validate(int age){
        return age>=3 && age <=15;
    }

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        overloading3 obj=new overloading3();
        System.out.println("Enter name: ");
        String name=s1.nextLine();
        System.out.println("Enter the age");
        int age=s1.nextInt();
        System.out.println("The name is: "+obj.validate(name));
        System.out.println("The age is "+obj.validate(age));
    }
}
