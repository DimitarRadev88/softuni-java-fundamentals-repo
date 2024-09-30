package com.basicSyntaxConditionalStatementsAndLoops.exercise;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class PrintAndSum {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int[] array = IntStream.rangeClosed(scanner.nextInt(), scanner.nextInt()).toArray();

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Sum: " + Arrays.stream(array).sum());
    }
}
