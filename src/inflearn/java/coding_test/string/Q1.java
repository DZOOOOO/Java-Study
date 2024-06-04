package inflearn.java.coding_test.string;

import java.io.*;

public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().toLowerCase().split("");
        String c = br.readLine().toLowerCase();

        int count = 0;
        for (String string : input) {
            if (string.equals(c)) {
                count += 1;
            }
        }

        bw.write(String.valueOf(count));

        br.close();
        bw.close();
    }
}
