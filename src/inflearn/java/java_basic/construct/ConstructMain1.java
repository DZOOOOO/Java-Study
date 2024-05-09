package inflearn.java.java_basic.construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] memberConstructs = {member1, member2};

        for (MemberConstruct memberConstruct : memberConstructs) {
            System.out.println("이름 : " + memberConstruct.name
                    + " 나이 : " + memberConstruct.age + " 성적 : " + memberConstruct.grade);
        }

    }
}
