package jungsuck.standard3.ch11;

import java.util.Iterator;

public class MyVector2Test {
    public static void main(String[] args) {
        MyVector2 v = new MyVector2();
        v.add("0");
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");

        System.out.println("삭제 전 : " + v);
        Iterator it = v.iterator();

        it.next(); // 0
        it.remove(); // 0 삭제
        it.next(); // 1
        it.remove(); // 1 삭제

        System.out.println("삭제 후 : " + v);
    }
}
