package sparta.firstweek_basic.homework.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        // O(n-2) * O(n-1) * O(n) -> n3
        System.out.println((n) * (n - 1) * (n - 2) / 6);
        System.out.println("3");
        br.close();
    }
}
