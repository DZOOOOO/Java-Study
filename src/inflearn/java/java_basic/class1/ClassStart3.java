package inflearn.java.java_basic.class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); // 메모리에 객체 생성 -> student1 변수에 참조값을 담는다.
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름 : " + student1.name + " 나이 : " + student1.age + " 성적 : " + student1.age);
        System.out.println("이름 : " + student2.name + " 나이 : " + student2.age + " 성적 : " + student2.age);

    }
}
