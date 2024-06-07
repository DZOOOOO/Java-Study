package sparta.firstweek_basic.homework.week2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 11557번: Yangjojang of The Year
// 메모리: 14120KB
// 속도: 108MS
public class Q12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int schoolCount = Integer.parseInt(br.readLine());
            Map<String, Integer> schoolInfo = new HashMap<>();
            for (int j = 0; j < schoolCount; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String schoolName = st.nextToken();
                int bottleCount = Integer.parseInt(st.nextToken());
                schoolInfo.putIfAbsent(schoolName, bottleCount);
            }

            int max = 0;
            String result = "";
            for (String s : schoolInfo.keySet()) {
                if (schoolInfo.get(s) > max) {
                    max = schoolInfo.get(s);
                    result = s;
                }
            }

            bw.write(result + "\n");
        }

        br.close();
        bw.close();
    }
}
