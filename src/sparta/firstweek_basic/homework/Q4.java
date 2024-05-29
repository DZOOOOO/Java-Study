package sparta.firstweek_basic.homework;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 상단 삼각형 부분
        for (int i = 1; i <= n; i++) {
            // 왼쪽 별 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 가운데 공백 출력
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // 오른쪽 별 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 다음 줄로 이동
            System.out.println();
        }

        // 하단 역삼각형 부분
        for (int i = n - 1; i >= 1; i--) {
            // 왼쪽 별 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 가운데 공백 출력
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // 오른쪽 별 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 다음 줄로 이동
            System.out.println();
        }
    }
}
