package com.basicSyntaxConditionalStatementsAndLoops.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class GamingStore {

    private static final Map<String, Double> GAME_PRICE_MAP = new HashMap<>();
    private static double BALANCE;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        cacheGamePrices();

        double initialBalance = Double.parseDouble(reader.readLine());

        BALANCE = initialBalance;

        String command = reader.readLine();

        while (!"Game Time".equals(command)) {
            try {
                buyGame(command);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

            if (BALANCE == 0) {
                System.out.println("Out of money!");
                return;
            }

            command = reader.readLine();
        }

        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", initialBalance - BALANCE, BALANCE);
    }

    private static void buyGame(String command) {
        Double gamePrice = GAME_PRICE_MAP.get(command);

        if (gamePrice == null) {
            throw new IllegalArgumentException("Not Found");
        } else if (BALANCE < gamePrice) {
            throw new IllegalStateException("Too Expensive");
        } else {
            BALANCE -= gamePrice;
            System.out.println("Bought " + command);
        }
    }

    private static void cacheGamePrices() {
        GAME_PRICE_MAP.put("OutFall 4", 39.99);
        GAME_PRICE_MAP.put("CS: OG", 15.99);
        GAME_PRICE_MAP.put("Zplinter Zell", 19.99);
        GAME_PRICE_MAP.put("Honored 2", 59.99);
        GAME_PRICE_MAP.put("RoverWatch", 29.99);
        GAME_PRICE_MAP.put("RoverWatch Origins Edition", 39.99);
    }
}
