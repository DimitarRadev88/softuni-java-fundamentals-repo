package com.dataTypesAndVariables.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FromLeftToTheRight {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int lines = Integer.parseInt(reader.readLine());

        for (int i = 0; i < lines; i++) {
            System.out.println(getSumOfGreaterNumber(reader.readLine()));
        }
    }

    private static int getSumOfGreaterNumber(String text) {
        return Arrays.stream(String.valueOf(Arrays.stream(text.split(" "))
                                .mapToLong(Long::parseLong).max().getAsLong())
                                    .replace("-", "").split(""))
                                    .mapToInt(Integer::parseInt).sum();
    }
}
