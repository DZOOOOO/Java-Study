package sparta.firstweek_basic.homework.week1;

import java.io.*;

public class Q14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(n) + " " + (n - 2));
        br.close();
    }

    static long fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n- 1) + fibonacci(n - 2);
    }
}
