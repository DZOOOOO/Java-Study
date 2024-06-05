package sparta.firstweek_basic.homework.week1;

import java.io.*;
import java.util.StringTokenizer;

public class Q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        bw.write(st.countTokens() + "");

        bw.close();
        br.close();
    }
}
