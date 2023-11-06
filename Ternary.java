
public class Ternary {

    public static void main(String[] args) {
        int a = 45;
        int b = 55;
        int c = 35;
        String res = (a > b) ? "a is bigger" : "b is bigger";
        System.out.println(res);
        int result = (a > b) ? (a > c ? a : b) : (b > c ? b : c);
        System.out.println(result);
    }
}