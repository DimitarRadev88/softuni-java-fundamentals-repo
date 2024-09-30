package com.arrays.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class ReverseArrayOfStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");


        reverseArray(input);

        System.out.println(String.join(" ", input));
    }

    private static void reverseArray(String[] input) {
        for (int i = 0, j = input.length - 1; i < input.length / 2 && j > input.length / 2 - 1; i++, j--) {
            String temp = input[i];
            input[i] = input[j];
            input[j] = temp;
        }
    }
}
