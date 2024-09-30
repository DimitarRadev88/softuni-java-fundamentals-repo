package com.arrays.lab;

import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersCount = Integer.parseInt(scanner.nextLine());

        int[] numbers = IntStream
                .range(0, numbersCount)
                .map(n -> Integer.parseInt(scanner.nextLine()))
                .toArray();

        printArrayContentInReverseOrder(numbers);
    }

    private static void printArrayContentInReverseOrder(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
