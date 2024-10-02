package com.methods.lab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        parseCommand(scanner);

    }

    private static void parseCommand(Scanner scanner) {
        String operation = scanner.nextLine();

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        int result = getResult(operation, first, second);

        printResult(result);
    }

    private static int getResult(String operation, int first, int second) {
        return switch (operation) {
            case "add":
                yield add(first, second);
            case "multiply":
                yield multiply(first, second);
            case "subtract":
                yield subtract(first, second);
            case "divide":
                yield divide(first, second);
            default: throw new UnsupportedOperationException();
        };
    }

    private static int divide(int first, int second) {
        return first / second;
    }

    private static int subtract(int first, int second) {
        return first - second;
    }

    private static int multiply(int first, int second) {
        return first * second;
    }

    private static int add(int first, int second) {
        return first + second;
    }

    private static void printResult(int result) {
        System.out.println(result);
    }
}
