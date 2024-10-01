package com.arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        int[] arr = Arrays.stream(new Scanner(System.in).nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int index = findNumberWithEqualSums(arr);

        System.out.println(index >= 0 ? index : "no");

    }

    private static int findNumberWithEqualSums(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (getSumBetweenIndices(arr, 0, i) == getSumBetweenIndices(arr, i + 1, arr.length)) {
                return i;
            }
        }

        return -1;
    }

    private static int getSumBetweenIndices(int[] arr, int from, int to) {
        return Arrays.stream(Arrays.copyOfRange(arr, from, to)).sum();
    }
}
