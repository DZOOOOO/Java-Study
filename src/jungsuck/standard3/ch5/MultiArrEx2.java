package jungsuck.standard3.ch5;

import java.util.Scanner;

public class MultiArrEx2 {
    public static void main(String[] args) {
        final int SIZE = 5;
        int x = 0;
        int y = 0;
        int num = 0;

        int[][] bingo = new int[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);

        // 빙고판 숫자 채우기
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                bingo[i][j] = i * SIZE + j + 1;
            }
        }

        // 빙고판 숫자 섞기
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                x = (int) (Math.random() * SIZE);
                y = (int) (Math.random() * SIZE);

                int tmp = bingo[i][j];
                bingo[i][j] = bingo[x][y];
                bingo[x][y] = tmp;
            }
        }

        do {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.printf("%2d ", bingo[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            System.out.printf("1~%d의 숫자를 입력하세요.(종료:0)>", SIZE * SIZE);
            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);

            // 입력숫자 0으로 체크
            outer:
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (bingo[i][j] == num) {
                        bingo[i][j] = 0;
                        break outer;
                    }
                }
            }

            // 0 이면 종료
        } while (num != 0);
    }
}
