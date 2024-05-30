package sparta.firstweek_basic.homework;

import java.io.*;

public class Q9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] input = br.readLine().toUpperCase().toCharArray();
        // 대문자 아스키 값기준 카운팅 65 ~ 90
        int[] count = new int[100];

        for (char c : input) {
            count[c] += 1;
        }

        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];
                maxIndex = i;
            } else if (count[i] != 0 && max == count[i]) {
                maxIndex = 63;
            }
        }

        bw.write((char) maxIndex);

        br.close();
        bw.close();
    }
}
