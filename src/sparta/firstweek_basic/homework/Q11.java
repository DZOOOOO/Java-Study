package sparta.firstweek_basic.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        // O(n)
        System.out.println(n);
        System.out.println("1");

        br.close();
    }
}
