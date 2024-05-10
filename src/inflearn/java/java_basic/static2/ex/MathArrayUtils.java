package inflearn.java.java_basic.static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int n : array) {
            sum += n;
        }
        return sum;
    }

    public static double average(int[] array) {
        return (double) sum(array) / array.length;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int n : array) {
            if (min > n) {
                min = n;
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int n : array) {
            if (max < n) {
                max = n;
            }
        }
        return max;
    }
}
