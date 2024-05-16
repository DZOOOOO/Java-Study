package inflearn.java.java_intermediate.nested.anonymous.ex0;

import java.util.Random;

public class Ex1Main {
    public static void helloDice(int randomValue) {
        System.out.println("프로그램 시작");

        System.out.println("주사위 = " + randomValue);

        System.out.println("프로그램 종료");
    }

    public static void helloSum(int index) {
        System.out.println("프로그램 시작");

        for (int i = 0; i < index; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("프로그램 종료");
    }


    public static void main(String[] args) {
        int randomValue = new Random().nextInt(6) + 1;
        helloDice(randomValue);
        helloSum(3);
    }
}
