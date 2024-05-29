package sparta.firstweek_basic.homework;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] nums = input.split(" ");
        int[] count = new int[3];

        // 같은 숫자 세기
        sameNumberCount(nums, count);

        // 최대값 구하기
        int max = count[0];
        int maxIndex = 0;
        for (int i = 1; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];
                maxIndex = i;
            }
        }

        // 조건에 맞는 계산 실행.
        int result = getResult(max, nums, maxIndex);
        System.out.println(result);
    }

    private static void sameNumberCount(String[] nums, int[] count) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i].equals(nums[j])) {
                    count[i] += 1;
                }
            }
        }
    }

    private static int getResult(int max, String[] nums, int maxIndex) {
        int result = 0;
        if (max == 3) {
            result = 10000 + Integer.parseInt(nums[maxIndex]) * 1000;
        } else if (max == 2) {
            result = 1000 + Integer.parseInt(nums[maxIndex]) * 100;
        } else if (max == 1) {
            int maxNum = Integer.parseInt(nums[0]);
            for (int i = 0; i < nums.length; i++) {
                if (maxNum < Integer.parseInt(nums[i])) {
                    maxNum = Integer.parseInt(nums[i]);
                }
            }
            result = maxNum * 100;
        }
        return result;
    }
}
