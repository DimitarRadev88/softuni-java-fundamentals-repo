package com.arrays.exercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        String[] first = new String[rows];
        String[] second = new String[rows];

        for (int i = 0; i < rows; i++) {
            String[] numbers = scanner.nextLine().split(" ");
            if (i % 2 == 0) {
                first[i] = numbers[0];
                second[i] = numbers[1];
            } else {
                first[i] = numbers[1];
                second[i] = numbers[0];
            }
        }

        printArray(first);
        printArray(second);
    }

    private static void printArray(String[] first) {
        System.out.println(String.join(" ", first));
    }
}
