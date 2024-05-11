package inflearn.java.java_basic.poly.ex.sender;

public class EmailSender implements Sender {
    @Override
    public void sendMessage(String msg) {
        System.out.println("메일 발송합니다: " + msg);
    }

}
