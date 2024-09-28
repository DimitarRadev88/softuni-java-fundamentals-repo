package com.basicSyntaxConditionalStatementsAndLoops.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationTable {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int multiplier = Integer.parseInt(reader.readLine());

        printMultiplication(multiplier, 1);
    }

    private static void printMultiplication(int multiplier, int multiplicand) {
        if (multiplicand > 10) {
            return;
        }

        System.out.printf("%d X %d = %d%n", multiplier, multiplicand, multiplier * multiplicand);

        printMultiplication(multiplier,multiplicand + 1);
    }
}
