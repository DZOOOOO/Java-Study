package inflearn.java.java_basic.com.order;

import inflearn.java.java_basic.com.product.Product;
import inflearn.java.java_basic.com.user.User;

public class OrderService {

    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
