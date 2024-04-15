package jungsuck.ch7;

public class InnerEx5 {
    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        Outer1.Inner inner = outer1.new Inner();
        inner.method1();
    }
}

class Outer1 {
    int value = 10;

    class Inner {
        int value = 20;

        void method1() {
            int value = 30;
            System.out.println(" value : " + value);
            System.out.println(" this.value : " + this.value);
            System.out.println(" Outer.this.value : " + Outer1.this.value);
        }
    }
}