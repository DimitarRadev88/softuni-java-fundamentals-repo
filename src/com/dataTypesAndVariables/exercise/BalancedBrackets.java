package com.dataTypesAndVariables.exercise;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int length = IntStream.range(0, lines)
                .mapToObj(l -> scanner.nextLine())
                .filter(l -> l.equals("(") || l.equals(")")).collect(Collectors.joining(""))
                .replaceAll("[(][)]", "").length();

        if (length != 0) {
            System.out.println("UNBALANCED");
        } else {
            System.out.println("BALANCED");
        }
    }
}
