package inflearn.java.java_intermediate.collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cart = new HashMap<>();

    public void add(Product product, int count) {
        Integer existingQuantity = cart.getOrDefault(product, 0);
        cart.put(product, existingQuantity + count);
    }

    public void minus(Product product, int count) {
        Integer productCount = cart.getOrDefault(product, 0);
        if (productCount >= count) {
            cart.put(product, productCount - count);
        }
    }

    public void printAll() {
        for (Product product : cart.keySet()) {
            System.out.println("상품: " + product + " 수량: " + cart.get(product));
        }
    }
}
