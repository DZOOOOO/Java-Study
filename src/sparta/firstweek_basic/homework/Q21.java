package sparta.firstweek_basic.homework;

import java.io.*;
import java.util.StringTokenizer;

// 메모리: 16092KB
// 시간: 160MS
public class Q21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] matrix = new int[9][9];
        createMatrix(br, matrix);

        // 최대값 구하기.
        int max = matrix[0][0];
        int rowIndex = 0;
        int columIndex = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    rowIndex = i;
                    columIndex = j;
                }
            }
        }

        // 0행 0열 시작이기 때문에 +1 해줌.
        rowIndex += 1;
        columIndex += 1;
        bw.write(max + "\n");
        bw.write(rowIndex + " " + columIndex);

        bw.close();
        br.close();
    }

    private static void createMatrix(BufferedReader br, int[][] matrix) throws IOException {
        for (int i = 0; i < 9; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
}
