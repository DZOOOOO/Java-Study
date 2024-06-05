package sparta.firstweek_basic.homework.week1;

import java.io.*;
import java.util.StringTokenizer;

// 메모리: 18012KB
// 시간: 240MS
public class Q20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nm = br.readLine();
        StringTokenizer st = new StringTokenizer(nm);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];

        // 행렬생성.
        createMatrix(n, br, m, a);
        createMatrix(n, br, m, b);

        // 행렬덧셈.
        int[][] resultMatrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                resultMatrix[i][j] += (a[i][j] + b[i][j]);
                bw.write(resultMatrix[i][j] + " ");
            }
            bw.write("\n");
        }

        br.close();
        bw.close();
    }

    private static void createMatrix(int n, BufferedReader br, int m, int[][] a) throws IOException {
        for (int i = 0; i < n; i++) {
            String element = br.readLine();
            StringTokenizer elements = new StringTokenizer(element);
            for (int j = 0; j < m; j++) {
                a[i][j] = Integer.parseInt(elements.nextToken());
            }
        }
    }
}
