package inflearn.java.java_basic.final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;
        data1 = 10;
//        data1 = 20; 변경 불가

        final int data2 = 10;
//        data2 = 20; 변경 불가

        method(10);
    }

    static void method(final int parameter) {
        // parameter = 20; 변경 불가
    }
}
