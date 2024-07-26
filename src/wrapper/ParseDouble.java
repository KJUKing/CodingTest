package wrapper;

public class ParseDouble {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};

        double sum = 0;
        for (String s : array) {
            double v = Double.parseDouble(s);
            sum += v;
        }

        System.out.println("sum = " + sum);
    }
}
