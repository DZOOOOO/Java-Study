package jungsuck.ch7;

public class InnerEx4 {
    public static void main(String[] args) {
        Outer oc = new Outer();
        Outer.InstanceInner il = oc.new InstanceInner();

        System.out.println("il.iv : " + il.iv);
        System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);

        Outer.StaticInner si = new Outer.StaticInner();
        System.out.println("si.iv : " + si.iv);
    }
}

class Outer {
    class InstanceInner {
        int iv = 100;
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 200;
    }

    void myMethod() {
        class LocalInner {
            int iv = 400;
        }
    }
}
