package sparta.firstweek_basic.homework.week2;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<String> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                stack.push(st.nextToken());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Case #").append(i+1).append(": ");
            int len = stack.size();
            for (int j = 0; j < len; j++) {
                String word = stack.pop();
                sb.append(word).append(" ");
            }
            String result = sb.toString();
            bw.write(result + "\n");
        }

        br.close();
        bw.close();
    }
}
