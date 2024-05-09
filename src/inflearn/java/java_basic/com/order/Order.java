package inflearn.java.java_basic.com.order;

import inflearn.java.java_basic.com.product.Product;
import inflearn.java.java_basic.com.user.User;

public class Order {

    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
