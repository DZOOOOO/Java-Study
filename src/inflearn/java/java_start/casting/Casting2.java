package inflearn.java.java_start.casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

//        intValue = doubleValue; --> 컴파일 오류.
        intValue = (int) doubleValue;
        System.out.println(intValue);

        System.out.println("doubleValue = " + doubleValue);
    }
}