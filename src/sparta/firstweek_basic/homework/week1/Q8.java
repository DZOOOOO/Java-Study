package sparta.firstweek_basic.homework.week1;

import java.io.*;
import java.util.StringTokenizer;

public class Q8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
            if (result < num) {
                result = num;
            }
        }
        bw.write(result+"");

        br.close();
        bw.close();
    }
}
