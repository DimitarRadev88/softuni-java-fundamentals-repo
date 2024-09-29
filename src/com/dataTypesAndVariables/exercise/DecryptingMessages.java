package com.dataTypesAndVariables.exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());

        int lines = Integer.parseInt(scanner.nextLine());

        System.out.println(getDecryptedMessage(scanner, key, lines));
    }

    private static int[] readLines(int lines, Scanner scanner, int key) {
        return IntStream.range(0, lines)
                .map(line -> scanner.nextLine().charAt(0) + key).toArray();
    }

    private static String getDecryptedMessage(int[] characters, int key) {
        return Arrays.stream(characters)
                .mapToObj(n -> String.valueOf((char) n))
                .collect(Collectors.joining(""));
    }

    private static String getDecryptedMessage(Scanner scanner, int key, int lines) {
        return IntStream.range(0, lines)
                .mapToObj(l -> String.valueOf((char) (scanner.nextLine().charAt(0) + key)))
                .collect(Collectors.joining(""));
    }
}
