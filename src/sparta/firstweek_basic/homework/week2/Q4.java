package sparta.firstweek_basic.homework.week2;

import java.io.*;
import java.util.Stack;

public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<String> stack = new Stack<>();
        String[] input = br.readLine().split("");
        stack.push(input[0]);
        int result = 10;
        for (int i = 1; i < input.length; i++) {
            String bowl = input[i];
            if (stack.peek().equals(bowl)) {
                result += 5;
            } else {
                result += 10;
            }
            stack.push(bowl);
        }

        bw.write(result + "");
        br.close();
        bw.close();
    }
}
