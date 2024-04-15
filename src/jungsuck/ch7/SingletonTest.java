package jungsuck.ch7;

public class SingletonTest {
    public static void main(String[] args) {
//        Singleton s = new Singleton(); 생성 불가
        Singleton s = Singleton.getInstance();
    }
}

class Singleton {
    private static Singleton s = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        if (s == null) {
            s = new Singleton();
        }
        return s;
    }
}