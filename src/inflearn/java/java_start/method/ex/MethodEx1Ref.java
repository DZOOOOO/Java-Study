package inflearn.java.java_start.method.ex;

public class MethodEx1Ref {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        int sum = sum(a,b,c);
        double average = average(sum);
        System.out.println("평균값: " + average);

        int x = 15;
        int y = 25;
        int z = 35;

        sum = x + y + z;
        average = average(sum);
        System.out.println("평균값: " + average);
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static double average(int sum) {
        return (double) sum / 3.0;
    }
}
