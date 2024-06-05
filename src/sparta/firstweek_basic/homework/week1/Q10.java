package sparta.firstweek_basic.homework.week1;

import java.io.*;
import java.util.StringTokenizer;

public class Q10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] scores = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int index = 0;
        int max = 0;
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            scores[index] = num;
            if (max < num) {
                max = num;
            }
            index += 1;
        }

        double sum = 0.0;
        for (int i = 0; i < scores.length; i++) {
            sum += ((double) scores[i] / max * 100);
        }
        String avg = (sum / n) + "";
        bw.write(avg);


        br.close();
        bw.close();
    }
}
