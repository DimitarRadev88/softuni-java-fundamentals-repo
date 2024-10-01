package com.dataTypesAndVariables.exercise;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        System.out.println("The sum equals: " + IntStream.range(0, lines).map(n -> scanner.nextLine().charAt(0)).sum());
    }
}
