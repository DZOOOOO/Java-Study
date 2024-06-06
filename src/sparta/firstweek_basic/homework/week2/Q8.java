package sparta.firstweek_basic.homework.week2;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] numbers = br.readLine().split(" ");
        int songCount = Integer.parseInt(numbers[0]);
        int answerCount = Integer.parseInt(numbers[1]);

        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < songCount; i++) {
            String[] input = br.readLine().split(" ");
            String title = input[1].substring(0, Integer.parseInt(input[0]));
            String code = input[2] + input[3] + input[4] + input[5] + input[6] + input[7] + input[8];
            String firstThreeNotes = code.substring(0, 3);
            map.putIfAbsent(firstThreeNotes, new ArrayList<>());
            map.get(firstThreeNotes).add(title);
        }

        for (int i = 0; i < answerCount; i++) {
            String[] code = br.readLine().split(" ");
            String c = code[0] + code[1] + code[2];
            if(map.containsKey(c)) {
                List<String> matchSong = map.get(c);
                if (matchSong.size() == 1) {
                    bw.write(matchSong.get(0) + "\n");
                } else {
                    bw.write("?\n");
                }
            } else {
                bw.write("!\n");
            }
        }

        br.close();
        bw.close();
    }
}
