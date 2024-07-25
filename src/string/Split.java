package string;

public class Split {

    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] part = email.split("@");
        String ID = part[0];
        String Domain = part[1];
        System.out.println("ID = " + ID);
        System.out.println("Domain = " + Domain);


    }
}
