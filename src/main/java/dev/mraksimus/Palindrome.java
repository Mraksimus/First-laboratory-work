package dev.mraksimus;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слово:");
        String s = scanner.nextLine();

        if (isPalindrome(s)) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }

    }

    public static boolean isPalindrome(String s) {

        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }

        return s.contentEquals(reversed);
    }

}
