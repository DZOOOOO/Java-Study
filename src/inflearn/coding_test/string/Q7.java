package inflearn.coding_test.string;

import java.util.Scanner;

// 내풀이
public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        input = input.toLowerCase();

        String reverse = new StringBuilder(input).reverse().toString();

        if (reverse.equals(input)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

// 강사님 풀이
class Solution7 {
    public String solution(String input) {

        return "";
    }
}