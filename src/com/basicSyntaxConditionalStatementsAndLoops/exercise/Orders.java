package com.basicSyntaxConditionalStatementsAndLoops.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Orders {
    private static final String COFFEE_PRICE_OUTPUT_MESSAGE = "The price for the coffee is: $%.2f%n";
    private static final String TOTAL_MESSAGE = "Total: $%.2f%n";
     private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        double[] ordersPrices = getOrders();

        printOrders(ordersPrices);

        printTotal(ordersPrices);
    }

    private static void printTotal(double[] ordersPrices) {
        System.out.printf(TOTAL_MESSAGE, Arrays.stream(ordersPrices).sum());
    }

    private static void printOrders(double[] ordersPrices) {
        Arrays.stream(ordersPrices)
                .forEach(price -> System.out.printf(COFFEE_PRICE_OUTPUT_MESSAGE, price));
    }

    private static double[] getOrders() throws IOException {
        int orders = Integer.parseInt(READER.readLine());

        double[] ordersPrices = new double[orders];

        for (int i = 0; i < orders; i++) {
            double pricePerCapsule = Double.parseDouble(READER.readLine());
            int daysInMonth = Integer.parseInt(READER.readLine());
            int count = Integer.parseInt(READER.readLine());

            ordersPrices[i] = pricePerCapsule * daysInMonth * count;
        }

        return ordersPrices;
    }
}
