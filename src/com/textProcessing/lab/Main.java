package com.textProcessing.lab;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
//        reverseStrings();
//        repeatString();
//        substring();
//        textFilter();
//        digitsLettersAndOther();
    }

    private static void digitsLettersAndOther() {
        String str = SCANNER.nextLine();

        System.out.println(str.replaceAll("\\D", ""));
        System.out.println(str.replaceAll("[\\W|\\d]", ""));
        System.out.println(str.replaceAll("\\w", ""));
    }

    private static void textFilter() {
        String[] bannedWords = SCANNER.nextLine().split(", ");

        String text = SCANNER.nextLine();

        for (String bannedWord : bannedWords) {
            text = text.replace(bannedWord, "*".repeat(bannedWord.length()));
        }

        System.out.println(text);
    }

    private static void substring() {
        String substring = SCANNER.nextLine();

        StringBuilder sb = new StringBuilder(SCANNER.nextLine());

        int indexOfSubstring = sb.indexOf(substring);
        while (indexOfSubstring >= 0) {
            sb.delete(indexOfSubstring, indexOfSubstring + substring.length());
            indexOfSubstring = sb.indexOf(substring);
        }

        System.out.println(sb);
    }

    private static void repeatString() {
        String[] input = SCANNER.nextLine().split(" ");

        Arrays.stream(input).forEach(str -> System.out.print(str.repeat(str.length())));
    }

    private static void reverseStrings() {
        String input = SCANNER.nextLine();

        while (!"end".equals(input)) {
            System.out.println(input + " = " + new StringBuilder(input).reverse());

            input = SCANNER.nextLine();
        }
    }
}
