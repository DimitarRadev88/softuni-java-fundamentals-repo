package com.textProcessing.exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
//        validUsernames();
//        characterMultiplier();
//        extractFile();
//        caesarCipher();
//        multiplyBigNumber();
//        replaceRepeatingChars();
//        stringExplosion();
    }

    private static void stringExplosion() {
        StringBuilder sb = new StringBuilder(SCANNER.nextLine());

        int explosion = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '>') {
                explosion += Character.getNumericValue(sb.charAt(i + 1));

                while (explosion > 0 && i < sb.length() - 1 && sb.charAt(i + 1) != '>') {
                    sb.delete(i + 1, i + 2);
                    explosion--;
                }
            }
        }

        System.out.println(sb);
    }

    private static void replaceRepeatingChars() {
        String str = SCANNER.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && sb.charAt(sb.length() - 1) == str.charAt(i)) {
                continue;
            }

            sb.append(str.charAt(i));
        }

        System.out.println(sb);
    }

    private static void multiplyBigNumber() {
        String number = SCANNER.nextLine().replace("-", "");
        int multiplier = Integer.parseInt(SCANNER.nextLine());
        if (multiplier == 0 || number.replaceAll("0", "").isEmpty()) {
            System.out.println(0);
            return;
        }

        StringBuilder result = new StringBuilder();

        int carriedNumber = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            int current = Character.getNumericValue(number.charAt(i));

            int product = current * multiplier;

            product += carriedNumber;

            String str = String.valueOf(product);

            result.append(str.charAt(str.length() - 1));

            carriedNumber = product / 10;
        }

        if (carriedNumber > 0) {
            result.append(carriedNumber);
        }

        System.out.println(result.reverse());

    }


    private static void caesarCipher() {
        String encrypted = Arrays.stream(SCANNER.nextLine().split(""))
                .map(c -> String.valueOf((char) (c.charAt(0) + 3))).collect(Collectors.joining(""));
        System.out.println(encrypted);
    }

    private static void extractFile() {
        String path = SCANNER.nextLine();

        int indexOfFileName = path.lastIndexOf("\\");

        int indexOfExtension = path.lastIndexOf(".");

        String fileName = "File name: " + path.substring(indexOfFileName + 1, indexOfExtension);
        String fileExtension = "File extension: " + path.substring(indexOfExtension + 1);

        System.out.println(fileName);
        System.out.println(fileExtension);
    }


    private static void characterMultiplier() {
        String[][] strings = Arrays.stream(SCANNER.nextLine().split(" ")).map(s -> s.split(""))
                .toArray(String[][]::new);

        int end = Math.min(strings[0].length, strings[1].length);

        int sum = 0;
        for (int i = 0; i < end; i++) {
            sum += strings[0][i].charAt(0) * strings[1][i].charAt(0);
        }

        sum += getRemainingSum(end, strings[0]);

        sum += getRemainingSum(end, strings[1]);

        System.out.println(sum);

    }

    private static int getRemainingSum(int end, String[] characters) {
        int sum = 0;
        for (int i = end; i < characters.length; i++) {
            sum += characters[i].charAt(0);
        }
        return sum;
    }


    private static void validUsernames() {
        Predicate<String> wordIsValid = s ->
                s.length() >= 3 && s.length() <= 16 &&
                        s.replaceAll("[\\w|_-]+", "").isEmpty();

        Arrays.stream(SCANNER.nextLine().split(", ")).filter(wordIsValid).forEach(System.out::println);
    }
}
