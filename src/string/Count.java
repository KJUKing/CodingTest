package string;

public class Count {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);
//        System.out.println("index = " + index);
        while (index >= 0) {
            index = str.indexOf(key, index + 1);
//            System.out.println("index = " + index);
//              6번째 인덱스에서 h으로 시작되는 단어 찾고 주소값 +1해서 반복못하게함
            count++;

        }
        System.out.println("count = " + count);

    }
}
