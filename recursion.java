public class recursion {

    void fun(int n)
    {
        if(n>0){

            System.out.println(n);
            fun(n-1);
        }

    }

    public static void main(String[] args) {
        recursion obj=new recursion();
        obj.fun(3);
    }
}
