package com.methods.lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    private static final String ADDITION_OPERATOR = "+";
    private static final String SUBTRACTION_OPERATOR = "-";
    private static final String MULTIPLICATION_OPERATOR = "*";
    private static final String DIVISION_OPERATOR = "/";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int second = scanner.nextInt();

        printFormattedNumber(calculate(first, operator, second));
    }

    private static void printFormattedNumber(double calculate) {
        DecimalFormat df = new DecimalFormat("#.####");

        System.out.println(df.format(calculate));
    }

    private static double calculate(int first, String operator, int second) {
        return switch (operator) {
            case ADDITION_OPERATOR: yield first + second;
            case SUBTRACTION_OPERATOR: yield first - second;
            case MULTIPLICATION_OPERATOR: yield first * second;
            case DIVISION_OPERATOR: yield first / second;
            default:throw new IllegalArgumentException();
        };
    }
}
