package jungsuck.standard3.ch7;

public class SuperTest {
    public static void main(String[] args) {
        Child child = new Child();
        child.method();
    }
}

class Parent {
    int x = 10;
}

class Child extends Parent {
    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}