class student5{
    private String Name;
    private int Age;
    private String intro;
    public student5(String name,int age)
    {
        this.Name=name;
        this.Age=age;
    }
    public void setIntro(String intro)
    {
        this.intro=intro;
    }
    public String getIntro()
    {
        return intro;
    }
    void print()
    {
        System.out.println("Name: "+this.Name+" Age: "+this.Age +" Intro: "+this.intro);

    }

}
public class arr_obj {
    public static void main(String[] args) {
        student5[] s1=new student5[5];
        s1[0]=new student5("John", 20);
        s1[0].setIntro("Hello, I am John.");
        s1[1]=new student5("Jane", 22);
        s1[1].setIntro("Hi, I am Jane.");
        s1[2]=new student5("Mike", 21);
        s1[2].setIntro("Hey, I am Mike.");
        for(int i=0;i<s1.length;i++)
        {
            s1[i].print();
        }
    }
}
