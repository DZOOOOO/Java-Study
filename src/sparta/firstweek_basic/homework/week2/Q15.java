package sparta.firstweek_basic.homework.week2;

import java.io.*;

// 2441번: 별 찍기 - 4
// 메모리: 14256KB
// 속도: 132MS
public class Q15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    bw.write(" ");
                } else {
                    bw.write("*");
                }
            }
            bw.write("\n");
        }

        br.close();
        bw.close();
    }
}
