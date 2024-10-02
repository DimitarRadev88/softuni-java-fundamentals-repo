package com.methods.lab;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintingTriangle {
    public static void main(String[] args) {
        int width = new Scanner(System.in).nextInt();

        printTriangle(width);
    }

    private static void printTriangle(int width) {
        for (int i = 0; i < width; i++) {
            printLineOfConsecutiveNumbers(i + 1);
        }

        for (int i = width - 1; i > 0 ; i--) {
            printLineOfConsecutiveNumbers(i);
        }


    }

    private static void printLineOfConsecutiveNumbers(int i) {
        System.out.println(IntStream.rangeClosed(1, i)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}
