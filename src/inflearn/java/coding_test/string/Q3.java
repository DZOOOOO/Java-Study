package inflearn.java.coding_test.string;

import java.io.*;

public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int maxLen = input[0].length();
        int maxIndex = 0;
        for (int i = 1; i < input.length; i++) {
            int len = input[i].length();
            if (maxLen < len) {
                maxLen = len;
                maxIndex = i;
            }
        }
        bw.write(String.valueOf(input[maxIndex]));

        br.close();
        bw.close();
    }
}
