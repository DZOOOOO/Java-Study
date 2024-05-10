package inflearn.java.java_basic.static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
//        instanceValue++; 인스턴스 변수 접근 불가능
//        instanceMethod(); 인스턴스 메서드 접근 불가능

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    // 참조값을 알 수 있으면 인스턴스 메서드 호출 가능
    public static void staticCall(DecoData data) {
        data.instanceCall();
        data.instanceMethod();
    }

    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 메서드 접근

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
