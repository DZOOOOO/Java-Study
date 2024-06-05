package sparta.firstweek_basic.homework.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        // O(n - 1) * O(n) -> n2
        System.out.println((n - 1) / 2 * n);
        System.out.println("2");

        br.close();
    }
}
