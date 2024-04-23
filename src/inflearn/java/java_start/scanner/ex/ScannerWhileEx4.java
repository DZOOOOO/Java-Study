package inflearn.java.java_start.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();
            scanner.nextLine();

            String name = "";
            int price = 0;
            int quantity = 0;

            if (option == 1) {
                System.out.print("상품명을 입력하세요:");
                name = scanner.nextLine();
                System.out.print("상품의 가격을 입력하세요:");
                price = scanner.nextInt();
                System.out.print("구매 수량을 입력해주세요:");
                quantity = scanner.nextInt();
                sum += (price * quantity);
                System.out.printf("상품명:%s 가격:%d 수량:%d 합계:%d%n", name, price, quantity, sum);
            } else if (option == 2) {
                System.out.println("총 비용:" + sum);
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }

        }
    }
}
