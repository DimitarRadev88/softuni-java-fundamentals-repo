package com.dataTypesAndVariables.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SpecialNumbers {

    private static final Set<Integer> SPECIAL_NUMBERS_DIGIT_SUM_SET = Set.of(5, 7, 11);
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());

        String output = IntStream.rangeClosed(1, number)
                .mapToObj(i -> i + " -> " + getIsDivisibleByBooleanAsText(getSumOfDigits(i), SPECIAL_NUMBERS_DIGIT_SUM_SET))
                .collect(Collectors.joining(System.lineSeparator()));

        System.out.println(output);

    }

    private static int getSumOfDigits(int number) {
        return Arrays.stream(String.valueOf(number).split("")).mapToInt(Integer::parseInt).sum();
    }

    private static String getIsDivisibleByBooleanAsText(int sumOfDigits, Set<Integer> numbers) {
        return numbers.contains(sumOfDigits) ? "True" : "False";
    }
}
