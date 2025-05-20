public class variableArg {
    /*
    static void show(int a[]){
        for(int x:a)
        {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        show(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        show(new int[]{1,2,3,4,5,6,7,8,9,10});//anonymous array
    }

     */
    void showList(int start,String ...s){
        for(int i=0;i<s.length;i++)
        {
            System.out.println(start+"."+s[i]);
            start++;
        }
    }

    public static void main(String[] args) {
        variableArg obj=new variableArg();
        obj.showList(5,"Hello","world","Java","Python","C++");
    }
}
