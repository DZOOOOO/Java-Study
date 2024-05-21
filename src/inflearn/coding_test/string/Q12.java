package inflearn.coding_test.string;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();

        String[] strs = new String[n];
        int len = input.length() / n;
        for (int i = 0; i < n; i++) {
            strs[i] = input.substring(i * len, i * len + len);
        }
        // # -> 1, * -> 0
        int[] result = new int[n];
        for (int i = 0; i < strs.length; i++) {
            char[] ch = strs[i].toCharArray();
            String pw = "";
            for (int j = 0; j < ch.length; j++) {
                if (ch[j] == '#') {
                    ch[j] = '1';
                } else if (ch[j] == '*') {
                    ch[j] = '0';
                }
                pw += ch[j];
            }
            result[i] = Integer.parseInt(pw, 2);
        }
        String answer = "";
        for (int i : result) {
            answer += (char) i;
        }
        System.out.println(answer);
    }
}

// 강사님 풀이
class Solution12 {
    public String solution(String input) {

        return "";
    }
}
