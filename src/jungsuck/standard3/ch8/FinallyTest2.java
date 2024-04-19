package jungsuck.standard3.ch8;

public class FinallyTest2 {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFile();
            deleteTempFiles();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() {
    }

    static void copyFile() {
    }

    static void deleteTempFiles() {
    }
}
