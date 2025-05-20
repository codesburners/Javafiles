class TV{
    public void on(){
        System.out.println("TV is on");
    }
    public void off(){
        System.out.println("TV is off");
    }
    public void changeChannel(){
        System.out.println("Channel is changed");
    }
}
class SmartTV extends TV{
    @Override
    public void on(){
        System.out.println("Smart TV is on");
    }
    @Override
    public void off(){
        System.out.println("Smart TV is off");
    }
    @Override
    public void changeChannel(){
        System.out.println("Smart TV Channel is changed");
    }
    public void browse(){
        System.out.println("Browsing");
    }
}
public class overriding1 {

    public static void main(String[] args) {
        TV t1=new TV();
        t1.on();
        t1.off();
        t1.changeChannel();

        SmartTV t2=new SmartTV(); // overrides superclass method and displays only subclass methods.
        t2.on();
        t2.off();
        t2.changeChannel();
        t2.browse();

        /* Dynamic Method dispatch
        // The method will be called depending on the object created.
        TV obj=new SmartTV(); // Super class can reference subclass object
        obj.on();
        obj.off();
        obj.changeChannel();
        //obj.browse(); //Error

         */
    }
}
