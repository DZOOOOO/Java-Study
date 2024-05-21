package inflearn.coding_test.string;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            char[] c = input.toCharArray();
            String s = "";
            for (int j = c.length - 1; j >= 0; j--) {
                s += c[j];
            }

            System.out.println(s);
        }
    }
}

// 강사님 풀이
class Solution4 {
    public String solution(String input) {

        return "";
    }
}