package com.basicSyntaxConditionalStatementsAndLoops.moreExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class SortNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[3];

        for (int n = 0; n < 3; n++) {
            numbers[n] = Integer.parseInt(reader.readLine());
        }

        Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}
