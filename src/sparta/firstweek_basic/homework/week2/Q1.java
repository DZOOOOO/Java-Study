package sparta.firstweek_basic.homework.week2;

import java.io.*;
import java.util.Stack;

public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            stack.push(number);
        }
        int first = stack.pop();
        int len = stack.size();
        int count = 1;

        for (int i = 0; i < len; i++) {
            int number = stack.pop();
            if (number > first) {
                first = number;
                count += 1;
            }
        }

        bw.write(count + "");

        br.close();
        bw.close();
    }
}
