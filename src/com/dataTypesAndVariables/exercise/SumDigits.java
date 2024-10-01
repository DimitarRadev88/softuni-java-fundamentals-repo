package com.dataTypesAndVariables.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new Scanner(System.in)
                .nextLine().split(""))
                .mapToInt(Integer::parseInt)
                .sum());
    }
}
