package com.basicSyntaxConditionalStatementsAndLoops.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ages {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int age = Integer.parseInt(reader.readLine());

        System.out.println(getAgeSpecification(age));
    }

    private static String getAgeSpecification(int age) {
        if (age >= 0 && age < 2) {
            return "baby";
        } else if (age <= 13) {
            return "child";
        } else if (age <= 19) {
            return "teenager";
        } else if (age <= 65) {
            return "adult";
        } else {
            return "elder";
        }
    }

}
