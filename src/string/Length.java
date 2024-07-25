package string;

public class Length {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        int cnt = 0;

        for (String s : arr) {

            int length = s.length();
            System.out.println(s+" : " +length);
            cnt += length;
        }
        System.out.println("cnt = " + cnt);
    }
}
