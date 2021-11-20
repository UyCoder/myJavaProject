package com.ahmed.bughra;

import java.util.Scanner;

public class Utility {
    private static Scanner scanner = new Scanner(System.in);
    public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.print("خاتا تاللىدىڭىز. قايتا تاللاڭ.：");
            } else break;
        }
        return c;
    }

    public static int readNumber() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(4);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("رەقەم خاتا كىرگۈزۈلدى، قايتا كىرگۈزۈڭ：");
            }
        }
        return n;
    }

    public static String readString() {
        String str = readKeyBoard(8);
        return str;
    }

    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("خاتا تاللىدىڭىز، قايتا تاللاڭ.：");
            }
        }
        return c;
    }


    private static String readKeyBoard(int limit) {
        String line = "";

        while (scanner.hasNext()) {
            line = scanner.nextLine();
            if (line.length() < 1 || line.length() > limit) {
                System.out.print("كىرگۈزگەن خەت كۆپ بوپ كەتتى（8 خەتتىن كۆپ بولماسلىقى كېرەك" + limit + "）قايتا كىرگۈزۈڭ：");
                continue;
            }
            break;
        }
        return line;
    }
}
