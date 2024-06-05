package sparta.firstweek_basic.homework.week1;

import java.io.*;

public class Q17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        int len = input.length() / 10;
        String result = input.substring(10 * len);
        for (int i = 1; i <= len; i++) {
            int startIndex = (i - 1) * 10;
            int endIndex = i * 10;
            bw.write(input.substring(startIndex, endIndex) + "\n");
        }
        bw.write(result);

        bw.close();
        br.close();
    }
}
