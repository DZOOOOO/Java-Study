package sparta.firstweek_basic.homework.week2;

import java.io.*;
import java.util.Arrays;

// 2805번: 나무 자르기
// 메모리: 138008KB
// 속도: 1100MS
public class Q14_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int needN = Integer.parseInt(input[1]);
        String[] numbers = br.readLine().split(" ");

        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = Integer.parseInt(numbers[i]);
        }

        // 높이 배열을 정렬
        Arrays.sort(heights);

        int low = 0;
        int high = heights[n - 1];
        int result = 0;

        // 이분 탐색 시작
        while (low <= high) {
            // 중간값 구하기.
            int mid = (low + high) / 2;
            long minHeightSum = 0;

            for (int i = 0; i < n; i++) {
                // 양수인 경우만 더해준다.
                if (heights[i] > mid) {
                    minHeightSum += (heights[i] - mid);
                }
            }

            // 나무의 높이는 크거나 같다.
            if (minHeightSum >= needN) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        bw.write(result + "\n");

        br.close();
        bw.close();
    }
}
