package sparta.firstweek_basic.homework.week2;

import java.io.*;

public class Q7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] original = new String[n];

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            original[i] = input;
        }

        String result = "";
        for (int i = 0; i < n; i++) {
            String reverse = new StringBuilder(original[i]).reverse().toString();
            for (int j = 0; j < n; j++) {
                if (original[j].equals(reverse)) {
                    result = original[j];
                }
            }
        }
        int targetLen = result.length();
        char target = result.charAt(targetLen / 2);

        bw.write(targetLen + " " + target);

        br.close();
        bw.close();
    }
}
