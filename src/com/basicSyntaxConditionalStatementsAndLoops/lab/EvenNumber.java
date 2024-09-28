package com.basicSyntaxConditionalStatementsAndLoops.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int absNumber = Math.abs(Integer.parseInt(reader.readLine()));
        String output = getFormattedOutput(absNumber);

        while (!output.startsWith("The number is: ")) {
            System.out.println(output);
            absNumber = Math.abs(Integer.parseInt(reader.readLine()));
            output = getFormattedOutput(absNumber);
        }

        System.out.println(output);
    }

    private static String getFormattedOutput(int absNumber) {
        return absNumber % 2 != 0 ?
                "Please write an even number." :
                "The number is: " + absNumber;
    }
}

