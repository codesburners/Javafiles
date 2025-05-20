class stu{
    private String name;
    private int age;
    public stu(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void display()
    {
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
    }
}
public class con_prac {
    public static void main(String[] args) {
stu s1=new stu("John", 20);
s1.display();

    }
}
