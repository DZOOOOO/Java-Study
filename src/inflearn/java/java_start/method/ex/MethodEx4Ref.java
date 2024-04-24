package inflearn.java.java_start.method.ex;

import java.util.Scanner;

public class MethodEx4Ref {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 0;
        while (true) {
            System.out.println("-------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("-------------------------------------");
            System.out.print("선택: ");
            int option = scanner.nextInt();
            if (option == 1) {
                System.out.println("입금액을 입력하세요: ");
                int deposit = scanner.nextInt();
                balance = deposit(balance, deposit);
            } else if (option == 2) {
                System.out.println("출금액을 입력하세요: ");
                int withdraw = scanner.nextInt();
                balance = withdraw(balance, withdraw);
            } else if (option == 3) {
                System.out.println("현재 잔액: " + balance);
            } else if (option == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("다시 입력해주세요.");
            }
        }
    }

    private static int withdraw(int balance, int withdraw) {
        if (balance >= withdraw) {
            balance -= withdraw;
            System.out.println(withdraw + "원을 출금하였습니다. 현재 잔액: " + balance);
        } else {
            System.out.println(withdraw + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }

    private static int deposit(int balance, int deposit) {
        balance += deposit;
        System.out.println(deposit + "원을 입금하였습니다. 현재 잔액: " + balance);
        return balance;
    }
}
