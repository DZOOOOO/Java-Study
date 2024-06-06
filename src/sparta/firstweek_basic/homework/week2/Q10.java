package sparta.firstweek_basic.homework.week2;

import java.io.*;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 자연수 -> 추가, 0 -> 배열에서 가장 작은 값을 출력, 배열에서 제거
        Queue<Integer> queue = new PriorityQueue<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            if (queue.isEmpty() && number == 0) {
                bw.write("0\n");
            }

            if (number != 0) {
                queue.add(number);
            } else if (!queue.isEmpty()) {
                bw.write(queue.poll() + "\n");
            }
        }

        br.close();
        bw.close();
    }
}
