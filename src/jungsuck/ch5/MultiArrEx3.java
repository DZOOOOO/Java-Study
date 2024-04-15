package jungsuck.ch5;

public class MultiArrEx3 {
    public static void main(String[] args) {
        // 2행 3열
        int[][] m1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // 3행 2열
        int[][] m2 = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        final int ROW = m1.length; // 2
        final int COL = m2[0].length; // 2
        final int M2_ROW = m2.length; // 3

        // 2행 2열
        int[][] m3 = new int[ROW][COL];

        // 행열의 곱
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                for (int k = 0; k < M2_ROW; k++) {
                    m3[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.printf("%3d ", m3[i][j]);
            }
            System.out.println();
        }
    }
}
