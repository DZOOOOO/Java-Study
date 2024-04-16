package jungsuck.ch12;

public class AnnotationEx1 {

}

class Parent {
    void parentMethod() {

    }
}

class Child extends Parent {
    @Override
    void parentMethod() {  // 메서드 이름 다르면 컴파일러가 잡아줌

    }
}