package inflearn.java.java_intermediate.nested.anonymous.test;

public class OuterClass3 {
    public void method() {
        class LocalClass {
            public void hello() {
                System.out.println("LocalClass.hello");
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.hello();
    }
}
