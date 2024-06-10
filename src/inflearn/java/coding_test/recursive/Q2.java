package inflearn.java.coding_test.recursive;

import java.io.*;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        DFS(n);
        System.out.println();
        System.out.println(factorial(n));

        br.close();
        bw.close();
    }

    private static void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            int rest = n % 2;
            int value = n / 2;
            DFS(value);
            System.out.print(rest + "");
        }
    }

    private static int factorial(int n) {
        int result = 0;
        if (n == 1) {
            result = 1;
        } else {
            result = n * factorial(n - 1);
        }
        return result;
    }
}
