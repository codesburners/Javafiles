class Phone{
    void phone()
    {
        System.out.println("Phone call");
    }
    void message()
    {
        System.out.println("Message");
    }
}
interface Icamera{
    void click();
    void record();
}
interface IMusic{
    void play();
    void stop();
}
class SmartPhone extends Phone implements Icamera,IMusic{
    public void videoCall()
    {
        System.out.println("Smart phone video calling");

    }
    @Override
    public void click()
    {
        System.out.println("Smart phone clicking photo ");

    }
    @Override
    public void record()
    {
        System.out.println("Smartphone recording video");

    }
    @Override
    public void play()
    {
        System.out.println("Smartphone play music");
    }
    @Override
    public void stop()
    {
        System.out.println("Smartphone stop music");
    }

}
public class Interface2 {
    public static void main(String[] args) {
        SmartPhone s1=new SmartPhone();
        s1.videoCall();
        s1.click();
        s1.record();
        s1.play();
        s1.stop();
        s1.phone();
        s1.message();
    }
}
