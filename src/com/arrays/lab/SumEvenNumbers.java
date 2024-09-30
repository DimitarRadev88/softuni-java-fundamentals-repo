package com.arrays.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SumEvenNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(getSumOfEvenNumbersFromInput(reader));

    }

    private static int getSumOfEvenNumbersFromInput(BufferedReader reader) throws IOException {
        return Arrays
                .stream(reader.readLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .filter(n -> n % 2 == 0)
                .sum();
    }

}
