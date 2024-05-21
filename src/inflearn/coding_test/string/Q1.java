package inflearn.coding_test.string;

import java.util.Scanner;

// 내 풀이
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        int count = 0;
        char[] ch = input1.toCharArray();
        for (char c : ch) {
            if(Character.toLowerCase(c) == Character.toLowerCase(input2.toCharArray()[0])) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}

// 강사님 풀이
class Solution1 {
    public String solution(String input) {

        return "";
    }
}
