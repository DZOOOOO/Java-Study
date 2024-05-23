package inflearn.java.java_intermediate.collection.map.test.cart;

public class CartMain {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("사과", 1000), 1);
        cart.add(new Product("바나나", 500), 1);
        cart.printAll();

        System.out.println();
        cart.add(new Product("사과", 1000), 2);
        cart.printAll();

        System.out.println();
        cart.minus(new Product("사과", 1000), 3);
        cart.printAll();
    }
}
