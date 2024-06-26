package jungsuck.standard3.ch5;

public class ArrayEx8 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        for (int i = 0; i < ball.length; i++) {
            ball[i] = i;
        }

        int temp = 0;
        int j = 0;

        for (int i = 0; i < 6; i++) {
            j = (int) (Math.random() * 45); // 무작위 Index 값.
            temp = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;
        }

        for (int i = 0; i < 6; i++) {
            System.out.printf("ball[%d] = %d%n", i, ball[i]);
        }
    }
}
