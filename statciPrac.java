class HondaCity{
    static long price=1000;
    int x,y;
    static double OnroadPrice(String city)
    {
        switch(city)
        {
            case "delhi":
                return price+price*0.1;

                case "mumbai":
                return price+price*0.15;
        }
        return 0;
    }

}
public class statciPrac {
    public static void main(String[] args) {
       HondaCity h1=new HondaCity();
       System.out.println("Honda City Price in Delhi: " + HondaCity.OnroadPrice("delhi"));
    }
}
