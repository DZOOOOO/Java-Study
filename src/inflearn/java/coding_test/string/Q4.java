package inflearn.java.coding_test.string;

import java.io.*;

public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String inputReverse = new StringBuilder(br.readLine()).reverse().toString();
            bw.write(inputReverse + "\n");
        }

        br.close();
        bw.close();
    }
}
