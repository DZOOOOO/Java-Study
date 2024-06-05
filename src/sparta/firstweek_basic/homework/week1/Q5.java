package sparta.firstweek_basic.homework.week1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        String date = "";

        // 날짜 포멧에 맞게 조건식 활용.
        if (month < 10) {
            if (day < 10) {
                date = "2007-0" + month + "-0" + day;
            } else {
                date = "2007-0" + month + "-" + day;
            }
        } else {
            if (day < 10) {
                date = "2007-" + month + "-0" + day;
            } else {
                date = "2007-" + month + "-" + day;
            }
        }

        // 날짜 데이터 입력 후 3글자만 출력
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(localDate.getDayOfWeek().toString().substring(0, 3));

    }
}
