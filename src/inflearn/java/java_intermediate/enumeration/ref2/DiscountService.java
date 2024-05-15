package inflearn.java.java_intermediate.enumeration.ref2;

public class DiscountService {
    public int discount(Grade grade, int price) {
        return price * grade.getDiscountPercent() / 100;
    }
}
