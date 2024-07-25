package string;

public class Reverse {
    public static void main(String[] args) {
        String str = "Hello Java";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("reversed = " + reversed);
    }
}
