package inflearn.java.java_intermediate.collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest2 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        Map<String, Integer> map = new HashMap<>();
        String[] str = text.split(" ");

        for (String string : str) {
            map.put(string,
                    map.getOrDefault(string, 0) + 1);
        }

        System.out.println(map);
    }
}
