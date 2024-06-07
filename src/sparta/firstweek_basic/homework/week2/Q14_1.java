package sparta.firstweek_basic.homework.week2;

import java.io.*;

// 2805번: 나무 자르기 --> 시간 초과
public class Q14_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int needN = Integer.parseInt(input[1]);
        String[] numbers = br.readLine().split(" ");

        int avg = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(numbers[i]);
        }
        avg = sum / n;

        int result = 0;
        while (true) {
            int minHeightSum = 0;
            for (int i = 0; i < n; i++) {
                int number = Integer.parseInt(numbers[i]);
                int min = number - avg;
                if (min > 0) {
                    minHeightSum += min;
                }
            }
            if (minHeightSum >= needN) {
                result = avg;
                break;
            } else {
                avg++;
            }
        }

        bw.write(result + "\n");


        br.close();
        bw.close();
    }
}
