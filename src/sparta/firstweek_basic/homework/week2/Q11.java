package sparta.firstweek_basic.homework.week2;

import java.io.*;
import java.util.Arrays;

// 2309번: 일곱 난쟁이
// 메모리: 15964KB
// 속도: 140MS
public class Q11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 7명 총 키는 100
        int n = 9;
        int sum = 0;
        int[] people = new int[n];
        for (int i = 0; i < n; i++) {
            int tall = Integer.parseInt(br.readLine());
            people[i] = tall;
            sum += people[i];
        }
        // 오름차순 정렬
        Arrays.sort(people);

        // 2명을 제외해야한다. -> 총 합이 100인 7명 뽑기
        int exceptionPeople1 = 0;
        int exceptionPeople2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sum - people[i] - people[j] == 100) {
                    exceptionPeople2 = people[j];
                    exceptionPeople1 = people[i];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (exceptionPeople1 == people[i]
                    || exceptionPeople2 == people[i]) {
                continue;
            }
            bw.write(people[i] + "\n");
        }

        br.close();
        bw.close();
    }
}
