package com.methods.lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int repetitions = Integer.parseInt(scanner.nextLine());

        String repeatedString = repeatString(str, repetitions);

        System.out.println(repeatedString);
    }

    private static String repeatString(String str, int repetitions) {
        return str.repeat(repetitions);
    }
}
