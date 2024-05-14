package inflearn.java.java_intermediate.lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        long currentMillis = System.currentTimeMillis();
        System.out.println("currentMillis = " + currentMillis);

        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        // 환경변수
        System.out.println("getenv = " + System.getenv());

        // 시스템 속성
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java Version: " + System.getProperty("java.version"));

        // 배열을 고속으로 복사
        char[] originalArray = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        System.out.println("copiedArray = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0);
    }
}
