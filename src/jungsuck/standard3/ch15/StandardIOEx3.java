package jungsuck.standard3.ch15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class StandardIOEx3 {
    public static void main(String[] args) {
        PrintStream ps = null;
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("src/jungsuck/standard3/ch15/test.txt");
            ps = new PrintStream(fos);
            System.setOut(ps);
        } catch (FileNotFoundException e) {
            System.err.println("File not Found");
        }
        System.out.println("Hello by System.out");
        System.err.println("Hello by System.err");
    }
}
