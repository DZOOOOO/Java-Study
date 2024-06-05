package sparta.firstweek_basic.homework.week1;

import java.io.*;

// 메모리: 14500KB
// 시간: 128MS
public class Q22 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 총 5개의 행을 가진다.
        int n = 5;
        // 최대 15개의 열을 가진다.
        int maxColumnLen = 15;
        String[][] matrix = new String[n][];
        for (int i = 0; i < n; i++) {
            matrix[i] = br.readLine().split("");
        }

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < maxColumnLen; i++) {
            for (int j = 0; j < n; j++) {
                try {
                    str.append(matrix[j][i]);
                } catch (Exception ignored) {
                }
            }
        }

        String result = str.toString();
        bw.write(result);

        br.close();
        bw.close();
    }
}
