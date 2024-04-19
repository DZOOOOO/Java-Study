package jungsuck.standard3.ch8;

public class FinallyTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFile();
            deleteTempFiles();
        } catch (Exception e) {
            e.printStackTrace();
            deleteTempFiles();
        }
    }

    static void startInstall() {}
    static void copyFile() {}
    static void deleteTempFiles() {}
}
