package com.basicSyntaxConditionalStatementsAndLoops.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOfOddNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numbersCount = Integer.parseInt(reader.readLine());

        int[] oddNumbers = new int[numbersCount];

        int[] oddNumbersArr = IntStream.rangeClosed(0, oddNumbers.length * 2).filter(n -> n % 2 != 0).toArray();

        Arrays.stream(oddNumbersArr).forEach(System.out::println);

        int sum = Arrays.stream(oddNumbersArr).sum();

        System.out.println("Sum: " + sum);

    }
}
