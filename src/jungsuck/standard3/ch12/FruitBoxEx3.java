package jungsuck.standard3.ch12;

import java.util.ArrayList;

public class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox2<Fruit2> fruitBox = new FruitBox2<>();
        FruitBox2<Apple2> appleBox = new FruitBox2<>();

        fruitBox.add(new Apple2());
        fruitBox.add(new Grape2());
        appleBox.add(new Apple2());
        appleBox.add(new Apple2());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }
}

class Fruit2 implements Eatable1 {
    public String toString() {
        return "Fruit";
    }
}

class Apple2 extends Fruit2 {
    public String toString() {
        return "Apple";
    }
}

class Grape2 extends Fruit2 {
    public String toString() {
        return "Grape";
    }
}

class Toy2 extends Fruit2 {
    public String toString() {
        return "Toy";
    }
}

class Juice {
    String name;

    Juice(String name) {
        this.name = name + "Juice";
    }

    public String toString() {
        return name;
    }
}

class Juicer {
    static Juice makeJuice(FruitBox2<? extends Fruit2> box) {
        String tmp = "";

        for (Fruit2 f : box.getList()) {
            tmp += f + " ";
        }

        return new Juice(tmp);
    }

}

interface Eatable1 {
}

class FruitBox2<T extends Fruit2 & Eatable1> extends Box2<T> {

}

class Box2<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    ArrayList<T> getList() {
        return list;
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}