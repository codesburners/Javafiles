import java.util.*;
public class varArg3 {
    double discount(double ...x)
    {
        if(x.length==0) return 0;
        else{
            double sum=0,discount=1;
            for(int i=0;i<x.length;i++)
            {
                sum+=x[i];
            }
            if(sum<1000)
            {
                discount=sum*0.1;
                return sum-discount;
            }
            else if(sum<2500){
                discount=sum*0.2;
                return sum-discount;
            }
            else if(sum<3500){
                discount=sum*0.3;
                return sum-discount;
            }
            else {
                discount =sum*0.4;
                return sum-discount;
            }
        }
    }

    public static void main(String[] args) {
        varArg3 obj=new varArg3();
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the prices: ");
        double p1=s1.nextInt();
        double p2=s1.nextInt();
        double p3=s1.nextInt();
        double c=obj.discount(p1,p2,p3);
        System.out.println(c);
    }
}
