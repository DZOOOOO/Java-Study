package inflearn.java.java_basic.oop.ex;

public class AmountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);
        account.showBalance();
    }
}
