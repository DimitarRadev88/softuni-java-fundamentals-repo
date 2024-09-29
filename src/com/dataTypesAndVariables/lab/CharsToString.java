package com.dataTypesAndVariables.lab;

import java.util.Scanner;
import java.util.stream.IntStream;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = IntStream.range(0, 3).mapToObj(i -> scanner.nextLine()).reduce("", String::concat);

        System.out.println(text);

    }
}
