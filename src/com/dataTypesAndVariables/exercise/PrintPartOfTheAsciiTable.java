package com.dataTypesAndVariables.exercise;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrintPartOfTheAsciiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IntStream.rangeClosed(scanner.nextInt(), scanner.nextInt())
                .mapToObj(n -> (char) n)
                .forEach(c -> System.out.print(c + " "));
    }
}
