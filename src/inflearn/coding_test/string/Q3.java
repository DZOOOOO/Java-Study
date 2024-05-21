package inflearn.coding_test.string;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] s = input.split(" ");

        int maxIndex = 0;
        int maxLen = 0;
        for(int i = 0; i < s.length; i++) {
            if (maxLen < s[i].length()) {
                maxLen = s[i].length();
                maxIndex = i;
            }
        }

        System.out.println(s[maxIndex]);
    }
}

// 강사님 풀이
class Solution3 {
    public String solution(String input) {

        return "";
    }
}