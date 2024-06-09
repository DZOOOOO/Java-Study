package sparta.firstweek_basic.homework.week2;

import java.io.*;

// 11899번: 괄호 끼워넣기
// 메모리: 15884KB
// 속도: 144MS
public class Q18 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        int openCount = 0;
        int closeCount = 0;

        for (char c : input.toCharArray()) {
            if (c == '(') {
                openCount += 1;
            } else if (c == ')') {
                if (openCount > 0) {
                    openCount--;
                } else {
                    closeCount += 1;
                }
            }
        }

        int result = closeCount + openCount;
        bw.write(result + "\n");

        br.close();
        bw.close();
    }
}
