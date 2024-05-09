package inflearn.java.java_basic.oop.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족");
        } else {
            balance -= amount;
        }
    }

    void showBalance() {
        System.out.println("잔고 : " + this.balance);
    }
}
