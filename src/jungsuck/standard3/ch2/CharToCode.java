package jungsuck.standard3.ch2;

public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A';
        int code = (int) ch; // 65

        System.out.printf("%c=%d(%#X)%n", ch, code, code);

        char hch = '가';
        System.out.printf("%c=%d(%#X)%n", hch, (int) hch, (int) hch);
    }
}
