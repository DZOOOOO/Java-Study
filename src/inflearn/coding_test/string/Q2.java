package inflearn.coding_test.string;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char[] ch = input.toCharArray();
        String answer = "";
        for (char c : ch) {
            if (c == Character.toLowerCase(c)) {
                answer += Character.toUpperCase(c);
            } else {
                answer += Character.toLowerCase(c);
            }
        }
        System.out.println(answer);
    }
}

// 강사님 풀이
class Solution2 {
    public String solution(String input) {

        return "";
    }
}
