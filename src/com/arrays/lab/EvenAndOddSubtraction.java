package com.arrays.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Predicate;

public class EvenAndOddSubtraction {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(getEvenSum(numbers) - getOddSum(numbers));
    }

    private static int getOddSum(int[] numbers) {
        return getFilteredNumbersSum(numbers, n -> n % 2 != 0);
    }

    private static int getEvenSum(int[] numbers) {
        return getFilteredNumbersSum(numbers, n -> n % 2 == 0);
    }

    private static int getFilteredNumbersSum(int[] numbers, Predicate<Integer> filter) {
        return Arrays.stream(numbers).filter(filter::test).sum();
    }
}
