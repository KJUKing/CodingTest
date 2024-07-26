package wrapper;

public class boxingUnboxing {
    public static void main(String[] args) {
        //오토 박싱 언박싱을 사용하지않음
        String str = "100";

        Integer strInteger = Integer.valueOf(str);
        System.out.println("strInteger = " + strInteger);

        int strIntegerIntValue = strInteger.intValue();
        System.out.println("strIntegerIntValue = " + strIntegerIntValue);

        Integer strIntegerIntValueInteger = Integer.valueOf(strIntegerIntValue);
        System.out.println("strIntegerIntValueInteger = " + strIntegerIntValueInteger);

        //오토 박싱 언박싱을 사용함
        String str1 = "100";

        Integer integer = Integer.valueOf(str);
        System.out.println("integer = " + integer);

        int integerInt = integer;
        System.out.println("integerInt = " + integerInt);

        Integer integerIntInteger = integerInt;
        System.out.println("integerIntInteger = " + integerIntInteger);

    }
}
