package sparta.firstweek_basic.homework;

import java.io.*;

// 메모리: 17460KB
// 시간: 196MS
public class Q23 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[][] matrix = new String[n][n];

        // 배열에 입력값 넣어주기.
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input[j];
            }
        }

        // 가로줄 체크
        int widthCount = checkWidth(matrix);
        // 세로줄 체크
        int heightCount = checkHeight(matrix);
        String result = widthCount + " " + heightCount;

        bw.write(result);

        br.close();
        bw.close();
    }

    private static int checkHeight(String[][] matrix) {
        int height = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                String dot = matrix[j][i];
                if (dot.equals(".")) {
                    count += 1;
                } else if (dot.equals("X")) {
                    if (count >= 2) {
                        height += 1;
                    }
                    count = 0;
                }
            }
            if (count >= 2) {
                height += 1;
            }
        }
        return height;
    }

    private static int checkWidth(String[][] matrix) {
        int width = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                String dot = matrix[i][j];
                if (dot.equals(".")) {
                    count += 1;
                } else if (dot.equals("X")) {
                    if (count >= 2) {
                        width += 1;
                    }
                    count = 0;
                }
            }
            if (count >= 2) {
                width += 1;
            }
        }
        return width;
    }
}
