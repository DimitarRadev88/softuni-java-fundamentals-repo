package com.basicSyntaxConditionalStatementsAndLoops.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StrongNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String number = reader.readLine();

        int digits = Arrays.stream(number.split(""))
                .mapToInt(Integer::parseInt)
                .map(d -> getFactorial(d)).sum();

        System.out.println(String.valueOf(digits).equals(number) ? "yes" : "no");
    }

    private static int getFactorial(int number) {
        if (number < 1) {
            return 1;
        }

        return number * getFactorial(number - 1);
    }


}
