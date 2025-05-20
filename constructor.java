class sample{
    private int sample1;
    private int sample2;
    public  sample()
    {
        sample1=1;
        sample2=1;
    }
    public sample(int s1,int s2){
        sample1=s1;
        sample2=s2;
    }

}
public class constructor {
    public static void main(String[] args) {
        sample s1=new sample(80,90);
    }
}
