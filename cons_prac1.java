class cylinder1{
    private int radius;
    private int height;
    public cylinder1()
    {
        radius=1;
        height=1;
    }
    public cylinder1(int r)
    {
        setRadius(r);
    }
    public cylinder1(int r,int h){
        setRadius(r);
        setHeight(h);
    }
    public int getRadius()
    {
        return radius;
    }
    public int getheight()
    {
        return height;
    }
    public void setRadius(int r)
    {
        radius=r;
    }
    public void setHeight(int h)
    {
        height=h;
    }
    public void setDimensions(int r,int h)
    {
        radius=r;
        height=h;
    }
    public int area()
    {
        return 2*3*radius*(radius+height);
    }
}
public class cons_prac1 {
    public static void main(String[] args) {
        cylinder1 r1=new cylinder1(10,20);
        System.out.println(r1.area());
    }
}
