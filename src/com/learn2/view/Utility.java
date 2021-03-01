package com.learn2.view;

import java.util.Scanner;

public class Utility {
    public static Scanner scanner = new Scanner(System.in);

    public static char promptReturnChar(String issue, boolean required) {
        String str = promptReturnString(issue, 1, required);
        return str.length() == 0 ? null : str.charAt(0);
    }

    public static String promptReturnString(String issue, int maxLen, boolean required) {
        String str = "";
        while (true) {
            System.out.print(issue);
            str = readKeyBoard();
            if (str.length() == 0) {
                if (required) {
                    continue;
                } else {
                    break;
                }
            }
            if (str.length() > maxLen) {
                System.out.print("最多只能输入" + maxLen + "个字符");
                continue;
            }
            break;
        }
        return str;
    }

    public static int promptReturnInt(String issue, boolean required, int min, int max) {
        int index = 0;
        while (true) {
            System.out.print(issue);
            String str = readKeyBoard();

            try {
                index = Integer.parseInt(str);

                if (index < min || index > max) {
                    System.out.println("请输入" + min + "到" + max + "之间的数字");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                if (required) {
                    System.out.println("请输入数字");
                    continue;
                }
                break;
            }
        }
        return index;
    }

    public static boolean promptReturnBool(String issue) {
        while (true) {
            Character c = promptReturnChar(issue + " (Y/N): ", true);
            String s = c.toString().toUpperCase();
            if (s != "Y" && s != "N") {
                System.out.println("请输入Y或者N");
                continue;
            }
            return s == "Y";
        }
    }

    private static String readKeyBoard() {
        String lang = "";
        while (scanner.hasNextLine()) {
            System.out.println("1231231231");
            lang = scanner.nextLine();
            break;
        }
        return lang;
    }
}
