package sparta.firstweek_basic.homework.week2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// 1292번: 쉽게 푸는 문제
// 메모리: 30048KB
// 속도: 180MS
public class Q16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int start = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= end; i++) {
            for (int j = 0; j < i; j++) {
                list.add(i);
            }
        }

        int sum = 0;
        for (int i = start - 1; i < end; i++) {
            sum += list.get(i);
        }

        bw.write(sum + "\n");

        br.close();
        bw.close();
    }
}
