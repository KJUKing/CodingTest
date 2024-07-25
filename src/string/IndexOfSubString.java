package string;

public class IndexOfSubString {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int i = str.indexOf(ext);
        System.out.println("i = " + i);

        String fileName = str.substring(0, i);
        System.out.println("fileName = " + fileName);
        String extName = str.substring(i);
        System.out.println("extName = " + extName);
    }
}
