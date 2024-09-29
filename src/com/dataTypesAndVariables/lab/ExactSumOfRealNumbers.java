package com.dataTypesAndVariables.lab;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = IntStream.range(0, n)
                .boxed()
                .map(i -> new BigDecimal(scanner.nextLine()))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.print(sum);

    }
}
