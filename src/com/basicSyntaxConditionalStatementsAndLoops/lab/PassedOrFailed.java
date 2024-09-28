package com.basicSyntaxConditionalStatementsAndLoops.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PassedOrFailed {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double grade = Double.parseDouble(reader.readLine());

        System.out.println(gradeIsPassing(grade) ? "Passed!" : "Failed!");
    }

    private static boolean gradeIsPassing(double grade) {
        return grade > 2.99;
    }
}
