package jungsuck.standard3.ch8;

public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            try { } catch (Exception e) { }
        } catch (Exception e) {
//            try { } catch (Exception e) {} 에러 변수 중복
        }

        try {

        } catch (Exception e) {

        }
    }
}
