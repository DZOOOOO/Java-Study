package inflearn.java.java_intermediate.collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("n개의 정수를 입력하세요 (종료 0)");

        while (true) {
            int n = scanner.nextInt();
            scanner.nextLine();
            if (n == 0) {
                break;
            }
            list.add(n);
        }

        for (int i : list) {
            sum += i;
        }

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + (double)sum / list.size());
    }
}
