package com.dataTypesAndVariables.exercise;

import java.util.Scanner;
import java.util.stream.IntStream;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = IntStream.range(0, 4).map(n -> scanner.nextInt()).toArray();

        System.out.println(getOperationsResult(numbers));
    }

    private static int getOperationsResult(int[] numbers) {
        return (numbers[0] + numbers[1]) / numbers[2] * numbers[3];
    }

}
