public class Regex_prac1 {
    public static void main(String[] args) {
        String str=" helloworld ";
        String reg = "[\\w\\s\\w]+$";
        System.out.println(str.matches(reg));
    }
}
