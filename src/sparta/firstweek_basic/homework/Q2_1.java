package sparta.firstweek_basic.homework;

import java.util.Scanner;

public class Q2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int result = 0;
        // 다 같은 경우
        if (num1 == num2 && num2 == num3) {
            result += 10000 + num1 * 1000;
            // 첫번째 == 두번째
        } else if (num1 == num2) {
            result += 1000 + num1 * 100;
            // 첫번째 == 세번째
        } else if (num1 == num3) {
            result += 1000 + num1 * 100;
            // 두번째 == 세번째
        } else if (num2 == num3) {
            result += 1000 + num2 * 100;
            // 다 다른 경우
        } else {
            int max = Math.max(num1, Math.max(num2, num3));
            result += max * 100;
        }
        System.out.println(result);
    }
}
