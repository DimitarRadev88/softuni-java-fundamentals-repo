package com.basicSyntaxConditionalStatementsAndLoops.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;

public class VendingMachine {
    private static final Set<Double> ACCEPTED_MONEY = Set.of(0.1, 0.2, 0.5, 1.00, 2.00);
    private static final String START_COMMAND = "Start";
    private static final String END_COMMAND = "End";
    private static final String DECLINED_MONEY_MESSAGE = "Cannot accept %.2f%n";
    private static final String PURCHASED_PRODUCT_MESSAGE = "Purchased %s%n";
    private static final String NOT_ENOUGH_MONEY_MESSAGE = "Sorry, not enough money%n";
    private static final String END_PROGRAM_MESSAGE = "Change: %.2f%n";
    private static final String INVALID_PRODUCT_MESSAGE = "Invalid product%n";
    private static final Map<String, Double> PRODUCTS_PRICES = Map.of(
            "Nuts", 2.0,
            "Water", 0.7,
            "Crisps", 1.5,
            "Soda", 0.8,
            "Coke", 1.0
    );
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        start();
    }

    private static void start() throws IOException {
        double money = addMoney();
        double change = buyProducts(money);
        endProgram(change);
    }

    private static void endProgram(double change) {
        System.out.printf(END_PROGRAM_MESSAGE, change);
    }

    private static double buyProducts(double money) throws IOException {
        String input = READER.readLine();

        while (!END_COMMAND.equals(input)) {
            if (PRODUCTS_PRICES.containsKey(input)) {
                double cost = PRODUCTS_PRICES.get(input);
                if (cost > money) {
                    System.out.printf(NOT_ENOUGH_MONEY_MESSAGE);
                } else {
                    System.out.printf(PURCHASED_PRODUCT_MESSAGE, input);
                    money -= cost;
                }
            } else {
                System.out.printf(INVALID_PRODUCT_MESSAGE);
            }

            input = READER.readLine();
        }

        return money;
    }

    private static double addMoney() throws IOException {
        String input = READER.readLine();

        double money = 0;
        while (!START_COMMAND.equals(input)) {
            double coin = Double.parseDouble(input);

            if (ACCEPTED_MONEY.contains(coin)) {
                money += coin;
            } else {
                System.out.printf(DECLINED_MONEY_MESSAGE, coin);
            }

            input = READER.readLine();
        }
        return money;
    }

}
