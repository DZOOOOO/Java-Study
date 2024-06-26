package jungsuck.standard3.ch6;

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x); // 10;

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x); // 10;
    }

    static void change(int x) {
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}

class Data {
    int x;
}