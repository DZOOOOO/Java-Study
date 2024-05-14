package inflearn.java.java_intermediate.lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        // split()
        String[] split = str.split(",");
        for (String s : split) {
            System.out.println(s);
        }

        String joinStr = "";
        for (String string : split) {
            joinStr += string + "-";
        }

        System.out.println("joinStr = " + joinStr);

        // join()
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열 = " + joinedStr);


        // 문자열 배열 연결
        String result = String.join("-", split);
        System.out.println("result = " + result);
    }
}
