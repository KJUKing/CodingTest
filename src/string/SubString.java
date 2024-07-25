package string;

public class SubString {
    public static void main(String[] args) {
        String str = "hello.txt";

        String substring = str.substring(5);
        System.out.println("substring = " + substring);
        String filename = str.substring(0, 5);
        System.out.println("filename = " + filename);
        String extName = str.substring(5, 9);
        System.out.println("extName = " + extName);
    }
}
