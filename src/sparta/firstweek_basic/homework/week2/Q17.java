package sparta.firstweek_basic.homework.week2;

import java.io.*;
import java.util.Arrays;

// 28417번: 스케이트보드
// 메모리: 77104KB
// 속도: 596MS
public class Q17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] resultScore = new int[n];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            // 런에서 받은 최고 점수, 트릭 연기 상위 2, 총 3개의 합계
            int firstRun = Integer.parseInt(input[0]);
            int secondRun = Integer.parseInt(input[1]);
            int runMaxScore = Math.max(firstRun, secondRun);

            int[] trickScores = new int[5];
            for (int j = 2; j < 7; j++) {
                trickScores[j - 2] = Integer.parseInt(input[j]);
            }
            Arrays.sort(trickScores);
            int len = trickScores.length;

            int result = runMaxScore + trickScores[len - 1] + trickScores[len - 2];
            resultScore[i] = result;
        }
        Arrays.sort(resultScore);

        bw.write(resultScore[resultScore.length - 1] + "\n");

        br.close();
        bw.close();
    }
}
