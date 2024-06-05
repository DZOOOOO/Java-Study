package sparta.firstweek_basic.homework.week1;

import java.io.*;
import java.util.StringTokenizer;

public class Q18 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        // s진수 숫자 'A' -> 65, 'Z' -> 90
        String n = st.nextToken();
        // s진법
        int s = Integer.parseInt(st.nextToken());

        int result = 0;
        int power = 0; // 자릿수를 나타내는 변수
        for (int i = n.length() - 1; i >= 0; i--) {
            char digit = n.charAt(i);
            int value;

            if (digit >= 'A' && digit <= 'Z') {
                // 문제에 주어진 알파벳 숫자 값으로 변환.
                value = digit - 55;
            } else {
                // 10진수 숫자 변환.
                value = digit - 48;
            }

            result += (int) (value * Math.pow(s, power));
            power++;
        }

        bw.write(String.valueOf(result));
        bw.close();
        br.close();
    }
}
