package com.methods.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        nXnMatrix();
    }

    private static void topNumber() {
        int end = SCANNER.nextInt();

        getTopNumbersInRange(1, end).forEach(System.out::println);
    }

    private static List<Integer> getTopNumbersInRange(int start, int end) {
        return IntStream.rangeClosed(start, end).filter(n -> isDivisibleBy8AndHasAtLeastOneOddDigit(n))
                .boxed().toList();
    }

    private static boolean isDivisibleBy8AndHasAtLeastOneOddDigit(int number) {
        int[] digits = Arrays.stream(("" + number).split("")).mapToInt(Integer::parseInt).toArray();

        if (Arrays.stream(digits).filter(n -> n % 2 != 0).toArray().length < 1) {
            return false;
        }

        return getSumOfDigits(digits) % 8 == 0;
    }


    private static int getSumOfDigits(int[] digits) {
        return Arrays.stream(digits).sum();
    }

    private static void palindromeIntegers() {
        String input = SCANNER.nextLine();

        while (!"END".equals(input)) {
            System.out.println(isPalindrome(input));

            input = SCANNER.nextLine();
        }
    }

    private static boolean isPalindrome(String input) {
        return input.contentEquals(new StringBuilder(input).reverse());
    }

    private static void factorialDivision() {
        int first = SCANNER.nextInt();
        int second = SCANNER.nextInt();
        System.out.printf("%.2f", divideFactorials(first, second));
    }

    private static double divideFactorials(int first, int second) {
        return 1.00 * getFactorial(first) / getFactorial(second);
    }

    private static long getFactorial(int n) {
        if (n < 2) {
            return 1;
        }

        return n * getFactorial(n - 1);
    }

    private static void nXnMatrix() {
        int number = Integer.parseInt(SCANNER.nextLine());

        printNxNMatrix(number);
    }

    private static void printNxNMatrix(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    private static void middleCharacters() {
        String str = SCANNER.nextLine();

        System.out.println(getMiddleCharacters(str));
    }

    private static String getMiddleCharacters(String str) {
        int middleIndex = str.length() / 2;
        return str.length() % 2 != 0 ? "" + str.charAt(middleIndex) : str.substring(middleIndex - 1, middleIndex + 1);
    }

    private static void addAndSubtract() {
        int first = SCANNER.nextInt();
        int second = SCANNER.nextInt();
        int third = SCANNER.nextInt();

        System.out.println(subtract(sum(first, second), third));
    }

    private static int subtract(int first, int second) {
        return first - second;
    }

    private static int sum(int first, int second) {
        return first + second;
    }

    private static void passwordValidator() {
        String password = SCANNER.nextLine();

        System.out.println(getPasswordValidationFeedback(password));
    }

    private static String getPasswordValidationFeedback(String password) {
        StringBuilder result = new StringBuilder();

        try {
            validateLength(password);
        } catch (IllegalStateException e) {
            result.append(e.getMessage()).append(System.lineSeparator());
        }

        try {
            validateContent(password);
        } catch (IllegalStateException e) {
            result.append(e.getMessage()).append(System.lineSeparator());
        }

        try {
            validateDigits(password);
        } catch (IllegalStateException e) {
            result.append(e.getMessage()).append(System.lineSeparator());
        }

        if (result.isEmpty()) {
            result.append("Password is valid");
        }

        return result.toString();
    }

    private static void validateContent(String password) {
        if (password.replaceAll("\\W", "").length() != password.length()) {
            throw new IllegalStateException("Password must consist only of letters and digits");
        }
    }


    private static void validateDigits(String password) {
        if (password.replaceAll("\\d", "").length() >= password.length() - 1) {
            throw new IllegalStateException("Password must have at least 2 digits");
        }
    }

    private static void validateLength(String password) {
        if (password.length() < 6 || password.length() > 10) {
            throw new IllegalStateException("Password must be between 6 and 10 characters");
        }
    }

    private static void charactersInRange() {
        char start = SCANNER.nextLine().charAt(0);
        char end = SCANNER.nextLine().charAt(0);

        printCharactersInRange(start, end);
    }

    private static void printCharactersInRange(char start, char end) {
        System.out.println(getCharactersInRange(start, end));
    }

    private static String getCharactersInRange(char start, char end) {
        return IntStream.range(Math.min(start, end) + 1, Math.max(start, end))
                .mapToObj(n -> String.valueOf((char) n))
                .collect(Collectors.joining(" "));
    }

    private static void vowelsCount() {
        String str = SCANNER.nextLine();

        System.out.println(getCountOfVowels(str));
    }

    private static int getCountOfVowels(String str) {
        return str.length() - str.replaceAll("[aeiouAEIOU]", "").length();
    }

    private static void smallestOfThreeNumbers() {
        int first = SCANNER.nextInt();
        int second = SCANNER.nextInt();
        int third = SCANNER.nextInt();

        System.out.println(getSmallestOfThree(first, second, third));

    }

    private static int getSmallestOfThree(int first, int second, int third) {
        return Arrays.stream(new int[]{first, second, third}).min().getAsInt();
    }
}
