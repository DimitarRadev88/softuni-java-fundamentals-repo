package com.dataTypesAndVariables.lab;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = IntStream.range(0, 3).mapToObj(i -> scanner.nextLine()).collect(Collectors.joining(" "));

        System.out.println(new StringBuilder(s).reverse());

    }
}
