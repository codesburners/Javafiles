class value{
    private String name;
    private int Age;
    private String sex;
    private int a[]=new int[10];

    public String getName()
    {
        return name;
    }
    public void setName(String nam)
    {
        name=nam;
    }
    public int getAge()
    {
        return Age;
    }
    public void setAge(int Age)
    {
        this.Age=Age;
    }
    public String getSex()
    {
        return sex;
    }
    public void setSex(String sex)
    {
        this.sex=sex;
    }
    public void setArr(int arr[])
    {
        this.a=arr;

    }
    public int[] getArr()
    {
        return a;
    }



}
public class get_prac {
    public static void main(String[] args) {
        value v=new value();
        v.setName("Gowtham");
        v.setAge(16);
        v.setSex("Male");
        v.setArr(new int[]{1, 2, 3, 4, 5});
        System.out.println("Name--->"+v.getName());
        System.out.println("Age--->"+v.getAge());
        System.out.println("Sex--->"+v.getSex());
        System.out.print("Array: ");
        for (int i : v.getArr()) {
            System.out.print(i + " ");
        }

    }
}
