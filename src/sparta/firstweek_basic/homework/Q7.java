package sparta.firstweek_basic.homework;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Q7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            String fruit = input[0];
            int count = Integer.parseInt(input[1]);
            if (map.get(fruit) == null) {
                map.put(fruit, count);
            } else {
                int newCount = map.get(fruit) + count;
                map.put(fruit, newCount);
            }
        }

        String result = "";
        for (String fruit : map.keySet()) {
            if (map.get(fruit) == 5) {
                result = "YES";
                break;
            } else {
                result = "NO";
            }
        }

        bw.write(result);

        br.close();
        bw.close();
    }
}
