package sparta.firstweek_basic.homework;

import java.io.*;

public class Q16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split("-");
        StringBuilder result = new StringBuilder();
        for (String firstName : input) {
            result.append(firstName.charAt(0));
        }

        bw.write(result.toString());

        bw.close();
        br.close();
    }
}
