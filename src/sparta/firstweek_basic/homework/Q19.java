package sparta.firstweek_basic.homework;

import java.io.*;
import java.util.ArrayList;

public class Q19 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<N; i++) list.add(br.readLine());

        String s = "", e = "";
        for(int i=0; i<N; i++) {
            if(list.get(i).equals("?")) {
                // try - catch -> index 예외가 터지는 경우가 있음.
                try {
                    // 앞문자 마지막 스펠링
                    s = String.valueOf(list.get(i-1).charAt(list.get(i-1).length()-1));
                } catch (Exception E) {}
                try {
                    // 뒷문자 첫 스펠링
                    e = String.valueOf(list.get(i+1).charAt(0));
                } catch (Exception E) {}
            }
        }

        int M = Integer.parseInt(br.readLine());
        for(int i=0; i<M; i++) {
            String str = br.readLine();
            String[] split = str.split("");

            // N이 1일 경우 -> "?" 한문자만 있기 때문에 비교 할 것 없이 바로 출력.
            if(N == 1) {
                bw.write(str);
                break;
            }

            // 중복일 경우 넘어감
            if(list.contains(str)) continue;

            // "?" 첫 번째 인 경우
            if(s.equals("")) {
                if(split[split.length-1].equals(e)) {
                    bw.write(str);
                }
            }
            // "?" 마지막인 경우
            else if(e.equals("")) {
                if(split[0].equals(s)) {
                    bw.write(str);
                }
            }
            // ?이 중간일 경우
            else {
                if(split[0].equals(s)
                        && split[split.length-1].equals(e)) {
                    bw.write(str);
                }
            }
        }
        bw.close();
        bw.close();
    }
}
