package jungsuck.standard3.ch14;

public class LambdaEx3 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method(100);
    }
}

@FunctionalInterface
interface MyFunction2 {
    void myMethod();
}

class Outer {
    int val = 10;

    class Inner {
        int val = 20;

        void method(int i) {
            int val = 30;
//            i = 10;

            MyFunction2 f = () -> {
                System.out.println("i : " + i); // 매개변수
                System.out.println("val : " + val); // 지역변수 val
                System.out.println("this.val : " + ++this.val); // 맴버번수 val
                System.out.println("Outer.this.val : " + ++Outer.this.val); // 외부 클래스 맴버 변수
            };

            f.myMethod();
        }
    }
}