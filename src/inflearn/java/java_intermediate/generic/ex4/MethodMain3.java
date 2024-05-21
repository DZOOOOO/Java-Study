package inflearn.java.java_intermediate.generic.ex4;

import inflearn.java.java_intermediate.generic.animal.Cat;
import inflearn.java.java_intermediate.generic.animal.Dog;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 100);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        Cat returnCat = hospital.printAnimal(cat);
        System.out.println("returnCat = " + returnCat);
    }
}
