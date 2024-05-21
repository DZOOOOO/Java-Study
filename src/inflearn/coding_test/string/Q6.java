package inflearn.coding_test.string;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char[] chs = input.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            for (int j = i + 1; j < chs.length; j++) {
                if (chs[i] == chs[j]) {
                    chs[j] = '_';
                }
            }
        }

        String result = "";
        for (char c : chs) {
            if (c != '_') {
                result += c;
            }
        }

        System.out.println(result);
    }
}

// 강사님 풀이
class Solution6 {
    public String solution(String input) {

        return "";
    }
}