package inflearn.java.java_intermediate.exception.ex2;

public class NetworkClientExceptionV2 extends Exception {
    private String errorCode;

    public NetworkClientExceptionV2(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
