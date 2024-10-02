package com.methods.lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        printPrice(calculatePrice(product, quantity));
    }

    private static void printPrice(double price) {
        System.out.printf("%.2f", price);
    }

    private static double calculatePrice(String product, int quantity) {
        return  getPrice(product) * quantity;
    }

    private static double getPrice(String product) {
        return switch (product) {
            case "coffee":
                yield 1.50;
            case "water":
                yield 1.00;
            case "coke":
                yield 1.40;
            case "snacks":
                yield 2.00;
            default:
                throw new IllegalArgumentException();
        };
    }
}
