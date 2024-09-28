package com.basicSyntaxConditionalStatementsAndLoops.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnglishNameOfTheLastDigit {

    private static final String[] DIGIT_NAMES = {
            "zero", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine"
    };

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String number = reader.readLine();

        System.out.println(getLastDigitName(number));
    }

    private static String getLastDigitName(String number) {
        return DIGIT_NAMES[Integer.parseInt(number.substring(number.length() - 1))];
    }
}
