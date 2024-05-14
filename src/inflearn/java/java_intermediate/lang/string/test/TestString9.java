package inflearn.java.java_intermediate.lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";

        String id = email.split("@")[0];
        String domain = email.split("@")[1];

        System.out.println("ID: " + id);
        System.out.println("Domain: " + domain);
    }
}
