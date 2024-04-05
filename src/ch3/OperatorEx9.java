package ch3;

public class OperatorEx9 {
    public static void main(String[] args) {
        long a = 1_000_000 * 1_000_000; // int * int -> int (오버플로)
        long b = 1_000_000 * 1_000_000L; // int * long -> long

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
