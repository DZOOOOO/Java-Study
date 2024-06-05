package sparta.firstweek_basic.homework.week1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        // 가로줄
        for (int i = 0; i < n; i++) {
            // 세로줄
            for (int j = 0; j < n; j++) {
                // 가로줄에 맞게 별 찍기. (i,j) -> (0,0), (0,1), ~ (0,n) ~, (n-1, n-1)
                if (j <= i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
