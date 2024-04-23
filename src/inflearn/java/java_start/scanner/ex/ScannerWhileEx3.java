package inflearn.java.java_start.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        int sum = 0;
        double avg = 0.0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            sum += num;
            count += 1;
            avg = (double) sum / count;
        }
        System.out.println("입력한 숫자들의 합계 : " + sum);
        System.out.println("입력헌 숫자들의 평균: : " + avg);
    }
}
