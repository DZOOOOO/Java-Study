package sparta.firstweek_basic;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] nums = input.split(" ");
        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]);

        String result = num1 > num2 ? ">" : (num1 < num2) ? "<" : "==";
        System.out.println(result);
    }
}
