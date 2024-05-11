package inflearn.java.java_basic.poly.ex.pay0;

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        int amount1 = 5000;
        payService.processPay("kakao", amount1);

        int amount2 = 10000;
        payService.processPay("naver", amount2);

        int amount3 = 15000;
        payService.processPay("bad", amount3);
    }
}
