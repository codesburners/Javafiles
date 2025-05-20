class car{
    public void start()
    {
        System.out.println("Car is starting");
    }
    public void stop()
    {
        System.out.println("Car is stopping");
    }
    public void changeGear()
    {
        System.out.println("Car Gear changed");
    }
}
class LuxuryCar extends car{
    @Override
    public void changeGear()
    {
        System.out.println("Luxury Car Gear changed");
    }
    public void openRoof()
    {
        System.out.println("Roof is opened");
    }
}
public class overriding2 {
    public static void main(String[] args) {
        car c=new car();
        LuxuryCar l=new LuxuryCar();
        /*
        c.start();
        c.stop();
        c.changeGear();
        System.out.println("**********");
        l.start();
        l.stop();
        l.changeGear();
        l.openRoof();

         */
        car c1=new LuxuryCar();
        c1.start();
        c1.stop();
        c1.changeGear();
       /* c1.openRoof();*/ //Error because it is not in the parent class
    }
}
