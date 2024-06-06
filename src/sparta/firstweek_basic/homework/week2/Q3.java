package sparta.firstweek_basic.homework.week2;

import java.io.*;

public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // -32 대문자 'A' -> 65
        String input = br.readLine();
        char[] chs = input.toCharArray();
        int result = 0;
        for (char spell : chs) {
            // 대문자
            if ((int) spell > 64 && (int) spell < 91) {
                result += (int) spell - 38;
                // 소문자
            } else if ((int) spell > 96 && (int) spell < 123) {
                result += (int) spell - 96;
            }
        }
        String answer = isPrime(result) ? "It is a prime word." : "It is not a prime word.";
        bw.write(answer);

        br.close();
        bw.close();
    }

    private static boolean isPrime(int number) {
        // 문제에서 1도 소수로 정함.
        if (number == 1) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
