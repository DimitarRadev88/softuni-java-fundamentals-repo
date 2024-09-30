package com.basicSyntaxConditionalStatementsAndLoops.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Vacation {
    private static final double STUDENTS_DISCOUNT = 0.85;
    private static final int BUSINESS_DISCOUNT = 10;
    private static final double REGULAR_DISCOUNT = 0.95;
    private static int COUNT = 0;
    private static final Map<String, Map<String, Double>> PRICES = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        addPrices();

        COUNT = Integer.parseInt(reader.readLine());
        String type = reader.readLine();
        String dayOfWeek = reader.readLine();

        double discount = getDiscount(type);

        double total = PRICES.get(type).get(dayOfWeek) * COUNT;

        System.out.printf("Total price: %.2f", total * discount);

    }

    private static Double getDiscount(String type) {
        if (type.equals("Students") && COUNT >= 30) {
            return STUDENTS_DISCOUNT;
        } else if (type.equals("Business") && COUNT >= 100) {
            COUNT -= BUSINESS_DISCOUNT;
        } else if (type.equals("Regular") && COUNT >= 10 && COUNT <= 20) {
            return REGULAR_DISCOUNT;
        }

        return 1.00;
    }

    private static void addPrices() {
        PRICES.put("Students", new HashMap<>());
        PRICES.get("Students").put("Friday", 8.45);
        PRICES.get("Students").put("Saturday", 9.80);
        PRICES.get("Students").put("Sunday", 10.46);

        PRICES.put("Business", new HashMap<>());
        PRICES.get("Business").put("Friday", 10.90);
        PRICES.get("Business").put("Saturday", 15.60);
        PRICES.get("Business").put("Sunday", 16.00);

        PRICES.put("Regular", new HashMap<>());
        PRICES.get("Regular").put("Friday", 15.00);
        PRICES.get("Regular").put("Saturday", 20.00);
        PRICES.get("Regular").put("Sunday", 22.50);
    }
}
