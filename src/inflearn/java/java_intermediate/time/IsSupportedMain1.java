package inflearn.java.java_intermediate.time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int minute = now.get(ChronoField.SECOND_OF_MINUTE); // 지원하지 않는 필드.
        System.out.println("minute = " + minute);
    }
}
