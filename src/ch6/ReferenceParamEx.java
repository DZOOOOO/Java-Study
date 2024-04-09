package ch6;

public class ReferenceParamEx {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() : x = " + d.x); // 10

        change(d);
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x); // 1000
    }

    static void change(Data2 d) {
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }

}

class Data2 {
    int x;
}