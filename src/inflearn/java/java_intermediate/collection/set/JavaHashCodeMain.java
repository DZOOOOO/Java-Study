package inflearn.java.java_intermediate.collection.set;

import inflearn.java.java_intermediate.collection.set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        // Object 기본 HashCode -> 객체의 참조값을 기반으로 생성
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());

        // 각 클래스마다 hashCode 이미 오버라이딩 해두었다.
        Integer i = 10;
        String strA = "A";
        String strB = "AB";

        System.out.println("10.hashCode() = " + i.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("strB.hashCode() = " + strB.hashCode());

        // hashCode -> 마이너스 값이 들어올 수 있다.
        System.out.println("-1.hashCode() = " + Integer.valueOf(-1).hashCode());

        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        System.out.println("(member1 == member2) = " + (member1 == member2)); // false
        System.out.println("(member1 equals member2) = " + (member1.equals(member2))); // true
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());
    }
}
