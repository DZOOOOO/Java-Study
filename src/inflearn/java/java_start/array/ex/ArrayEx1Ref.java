package inflearn.java.java_start.array.ex;

public class ArrayEx1Ref {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        int total = 0;
        double average = 0.0;

        for (int student : students) {
            total += student;
        }

        average = (double) total / students.length;

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
