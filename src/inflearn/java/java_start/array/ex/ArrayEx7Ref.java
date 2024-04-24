package inflearn.java.java_start.array.ex;

import java.util.Scanner;

public class ArrayEx7Ref {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] students = new int[4][4];
        int totalScore = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            System.out.print("국어 점수:");
            students[i][0] = scanner.nextInt();
            System.out.print("수학 점수:");
            students[i][1] = scanner.nextInt();
            System.out.print("영어 점수:");
            students[i][2] = scanner.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < students[i].length; j++) {
                totalScore += students[i][j];
            }
            students[i][3] = totalScore;
            totalScore = 0;
        }

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 학생의 총점: " + students[i][3] +
                    ", 평균: " + (double) students[i][3] / 3);
        }
    }
}
