package inflearn.java.coding_test.string;

import java.io.*;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 대문자 -> 65 ~ 90, 소문자 -> 97 ~ 122
        char[] ch = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : ch) {
            if (c > 64 && c < 91) {
                sb.append(Character.toLowerCase(c));
            } else if (c > 96 && c < 123) {
                sb.append(Character.toUpperCase(c));
            }
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
