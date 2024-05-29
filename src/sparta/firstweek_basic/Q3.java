package sparta.firstweek_basic;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= 2 * i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
