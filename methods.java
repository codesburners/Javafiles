public class methods {
   void max(int x,int y)
    {
        if(x>y)
        {

            System.out.println("X is big->" +x);
        }
        else
        {
            y++;
            System.out.println("Y is big->" +y);
        }
    }
    public static void main(String[] args)
    {
        int x=10,y=20,c;
        methods obj=new methods();
        obj.max(x,y);

    }

}
