package com.dataTypesAndVariables.lab;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = IntStream.range(0, 3).mapToObj(i -> scanner.nextLine()).toArray(String[]::new);

        System.out.println(array[0] + array[2] + array[1]);
    }
}
