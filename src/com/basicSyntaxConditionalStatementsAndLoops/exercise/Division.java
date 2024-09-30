package com.basicSyntaxConditionalStatementsAndLoops.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Division {
    private static final int[] DIVISORS = {2, 3, 6, 7, 10};

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());

        int largestDivisor = Arrays.stream(DIVISORS).filter(divisor -> number % divisor == 0).max().orElse(0);

        System.out.println(largestDivisor == 0 ? "Not divisible" : "The number is divisible by " + largestDivisor);
    }
}
