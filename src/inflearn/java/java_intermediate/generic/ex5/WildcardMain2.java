package inflearn.java.java_intermediate.generic.ex5;

import inflearn.java.java_intermediate.generic.animal.Animal;
import inflearn.java.java_intermediate.generic.animal.Cat;
import inflearn.java.java_intermediate.generic.animal.Dog;

public class WildcardMain2 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        writeBox(objBox);
        writeBox(animalBox);
//        writeBox(dogBox); 하한이 Animal
//        writeBox(catBox); 하한이 Animal

        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);
    }

    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}
