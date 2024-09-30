package com.arrays.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EqualArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] firstNumbersArr = getNumbersArr(reader);
        int[] secondNumbersArr = getNumbersArr(reader);

        try {
            System.out.println(checkIntArraysEqualityAndPrintSum(firstNumbersArr, secondNumbersArr));
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String checkIntArraysEqualityAndPrintSum(int[] first, int[] second) {
        int sum = 0;
        for (int i = 0; i < first.length; i++) {
            sum += first[i];
            if (first[i] != second[i]) {
                throw new IllegalStateException("Arrays are not identical. Found difference at " + i + " index.");
            }
        }

        return "Arrays are identical. Sum: " + sum;
    }

    private static int[] getNumbersArr(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }
}
