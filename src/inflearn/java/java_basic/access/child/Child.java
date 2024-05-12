package inflearn.java.java_basic.access.child;

import inflearn.java.java_basic.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1; // 상속 or 같은 패키지
//        defaultValue = 1; 다른 패키지 접근 불가, 컴파일 오류
//        privateValue = 1; 접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod();
//        defaultMethod(); 다른 패키지 접근 불가, 컴파일 오류
//        privateMethod(); 접근 불가, 컴파일 오류

        printParent();
    }
}