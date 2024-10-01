package com.arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        int[] numbers = Arrays.stream(new Scanner(System.in).nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (isTopInteger(numbers, number, i + 1)) {
                System.out.print(number + " ");
            }
        }
    }

    private static boolean isTopInteger(int[] numbers, int number, int index) {
        for (int i = index; i < numbers.length; i++) {
            if (numbers[i] >= number) {
                return false;
            }
        }

        return true;
    }
}
