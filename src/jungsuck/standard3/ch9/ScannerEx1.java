package jungsuck.standard3.ch9;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] argArr = null;

        while (true) {
            String prompt = ">>";
            System.out.println(prompt);

            String input = s.nextLine();

            input = input.trim();
            argArr = input.split(" +"); // " +" 하나 이상의 공백의미.

            String command = argArr[0].trim();

            if ("".equals(command)) continue;

            command = command.toLowerCase();

            if (command.equals("q")) {
                System.exit(0);
            } else {
                for (int i = 0; i < argArr.length; i++) {
                    System.out.println(argArr[i]);
                }
            }
        }

    }
}
