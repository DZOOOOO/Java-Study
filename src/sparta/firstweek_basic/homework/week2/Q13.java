package sparta.firstweek_basic.homework.week2;

import java.io.*;
import java.util.Arrays;

// 16466번: 콘서트
// 메모리: 115376KB
// 속도: 588Ms
public class Q13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 숫자가 작을 수록 목소리가 잘 들린다.
        int n = Integer.parseInt(br.readLine());
        int[] tickets = new int[n];
        String[] numbers = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            tickets[i] = Integer.parseInt(numbers[i]);
        }

        // 오름차순 정렬
        Arrays.sort(tickets);
        // 티켓은 1번부터 시작.
        int result = 1;
        for (int i = 0; i < n; i++) {
            if (tickets[i] == result) {
                result++;
            } else if (tickets[i] > result) {
                break;
            }
        }

        bw.write(result + "\n");
        br.close();
        bw.close();
    }
}
