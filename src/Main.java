import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
//        DFS1(n);
//        DFS2(n);
//        System.out.println(DFS3(n));
        System.out.println(DFS4(n));

        br.close();
        bw.close();
    }

    // 숫자 출력(오름 차순)
    private static void DFS1(int n) {
        if (n == 0) {
            return;
        } else {
            DFS1(n - 1);
            System.out.print(n + " ");
        }
    }

    // 이진수 출력
    private static void DFS2(int n) {
        if (n == 0) {
            return;
        } else {
            DFS2(n / 2);
            System.out.print(n % 2 + "");
        }
    }

    // 팩토리얼 출력
    private static int DFS3(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * DFS3(n - 1);
        }
    }

    // 피보나치 수열
    private static int DFS4(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return DFS4(n - 2) + DFS4(n - 1);
        }
    }
}
