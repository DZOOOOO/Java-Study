package sparta.firstweek_basic.homework.week1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        // 입력받은 숫자크기 만큼 반복문 돌리기
        for (int k = 0; k < num; k++) {
            String input = sc.nextLine();
            String[] inputStr = input.split(" ");

            String result = "";
            // 입력받은 숫자 + 문자
            String[] str = inputStr[1].split("");
            for (int i = 0; i < str.length; i++) {
                for (int j = 0; j < Integer.parseInt(inputStr[0]); j++) {
                    result += str[i];
                }
            }
            System.out.println(result);
        }
    }
}
