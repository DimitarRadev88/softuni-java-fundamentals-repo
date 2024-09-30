package com.arrays.moreExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        IntStream.range(0, lines)
                .mapToObj(n -> scanner.nextLine())
                .mapToInt(name -> getEncryptedName(name))
                .sorted()
                .forEach(System.out::println);

    }

    private static int getEncryptedName(String name) {
        int length = name.length();
        return getEncryptedVowelsSum(name, length)
                +
                getEncryptedConsonantsSum(name, length);
    }

    private static int getEncryptedConsonantsSum(String name, int length) {
        return Arrays.stream(name.split("")).filter(l -> !isVowel(l)).mapToInt(l -> l.charAt(0) / length).sum();
    }

    private static int getEncryptedVowelsSum(String name, int length) {
        return Arrays.stream(name.split("")).filter(l -> isVowel(l)).mapToInt(l -> l.charAt(0) * length).sum();
    }

    private static boolean isVowel(String l) {
        return l.equalsIgnoreCase("a") ||
                l.equalsIgnoreCase("e") ||
                l.equalsIgnoreCase("i") ||
                l.equalsIgnoreCase("o") ||
                l.equalsIgnoreCase("u");

    }
}
