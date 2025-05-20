class  Super{
    public void display(){
        System.out.println("Super class");
    }
}
class sub extends Super{

    public void display(){

        System.out.println("Sub class");
    }
}
public class overriding {
    public static void main(String[] args) {

        sub obj=new sub();
        obj.display();
    }
}
