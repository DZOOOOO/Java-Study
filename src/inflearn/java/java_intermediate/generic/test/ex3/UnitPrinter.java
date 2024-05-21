package inflearn.java.java_intermediate.generic.test.ex3;

import inflearn.java.java_intermediate.generic.test.ex3.unit.BioUnit;

public class UnitPrinter {

    public static <T extends BioUnit> void printV1(Shuttle<T> t) {
        System.out.println("이름 : " + t.out().getName() + ", HP: " + t.out().getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> t) {
        System.out.println("이름 : " + t.out().getName() + ", HP: " + t.out().getHp());
    }
}
