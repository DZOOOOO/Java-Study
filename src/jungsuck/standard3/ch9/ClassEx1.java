package jungsuck.standard3.ch9;

public class ClassEx1 {
    public static void main(String[] args) throws Exception{
        Card2 c = new Card2("HEART", 3);
        Card2 c2 = Card2.class.newInstance();

        Class cObjc = c.getClass();

        System.out.println(c);
        System.out.println(c2);
        System.out.println(cObjc.getName());
        System.out.println(cObjc.toGenericString());
        System.out.println(cObjc.toString());
    }
}

class Card2 {
    String kind;
    int number;

    Card2() {
        this("SPADE", 1);
    }

    Card2(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        return kind + " : " + number;
    }
}
