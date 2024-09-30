package com.arrays.moreExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PascalTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int rows = Integer.parseInt(reader.readLine());

        long[] prev = null;
        long[] numbers = {1};
        printArray(numbers);

        for (int i = 1; i < rows; i++) {
            prev = Arrays.copyOf(numbers, numbers.length);
            numbers = new long[prev.length + 1];
            numbers[0] = 1;
            numbers[numbers.length - 1] = 1;

            for (int j = 1; j < prev.length; j++) {
                numbers[j] = prev[j - 1] + prev[j];
            }

            printArray(numbers);
        }
    }

    private static void printArray(long[] numbers) {
        Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
        System.out.println();
    }

}
